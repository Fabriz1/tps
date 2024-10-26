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
    paga(int i) {
    this.i=i;
    paga_random();
    this.mutex = new ReentrantLock();
    }

    paga(){
        
    }
    public void paga_random(){
        
        int[] carta=new int[2];//nel primo posto andrà i soldi da prelevare dalla carta nel secondo da quale conto 
        Random rand=new Random();
        conto scrivi=new conto();
        while(true){    
        
        carta[1]=rand.nextInt(i);    
        carta[0]=rand.nextInt(1000);
        mutex.lock();
            try {
                scrivi.paga(carta);
            } finally {
                mutex.unlock();
            }
        }

}
}
