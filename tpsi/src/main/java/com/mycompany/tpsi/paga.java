/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpsi;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author ospite
 */
class paga {
    private Lock mutex;
    int i;

    paga() {
        conto c = new conto(2);
        this.mutex = new ReentrantLock();
        paga_random();
    }

    public void paga_random() {
        conto c = new conto(2);
        int[] carta = new int[2];// nel primo posto andrà i soldi da prelevare dalla carta nel secondo da quale
                                 // conto
        Random rand = new Random();
        conto scrivi = new conto();
        while (true) {

            carta[1] = rand.nextInt(c.getdato());
            carta[0] = rand.nextInt(1000);
            mutex.lock();
            try {
                scrivi.paga(carta);
            } finally {
                mutex.unlock();
            }
        }

    }
}
