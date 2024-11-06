package com.example;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class paga extends Thread {
    conto c;
    Lock mutex = new ReentrantLock();
    Random rand = new Random();

    public paga(conto c) throws InterruptedException {
        this.c = c;
    }

    @Override
    public void run() {
        int quantita;
        int posizione;
        while (true) {
            quantita = Math.abs(rand.nextInt(100));
            posizione = rand.nextInt(c.conto.length);
            if (c.getConto(posizione) < quantita) {
            System.out.println("   soldi insufficienti  ");    
            }else{
            mutex.lock();
            System.out.print("pagamento effettuato di: " + quantita + "\n");
            c.setConto(posizione, -quantita);
            mutex.unlock();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
