/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpsi;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author ospite
 */
class conto {
    int i;
    public int[] conti;
    private Lock mutex = new ReentrantLock();

    conto() {
        System.out.println("bla vbal ");
        mutex.lock();
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        this.i = i;
        this.conti = new int[i];
        for (int c = 0; c < i; c++) {
            this.conti[c] = 1000;
            System.out.println(conti);
        }
        mutex.unlock();
    }

    conto(int l) {
        System.out.println("capito");
    }

    public void paga(int[] dati) {

        this.conti[dati[1]] -= dati[0];
        System.out.println(conti[dati[1]]);
    }

    void guadagna(int[] dati) {
        conti[dati[1]] += dati[0];
        System.out.println(conti[dati[1]]);
    }

    public int getdato() {
        return this.i;

    }

}
