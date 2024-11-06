package com.example;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class guadagna extends Thread{
    Lock mutex=new ReentrantLock();   
    conto c;
    Random rand = new Random();

    public guadagna(conto c) {
        this.c = c;
    }
    @Override
    public void run(){
        int quantita;
        while (true) {
            quantita = Math.abs(rand.nextInt(100));
            mutex.lock();
            System.out.print("hai guadagnato: " + quantita + "\n");
            c.setConto(rand.nextInt(c.conto.length), quantita);
            mutex.unlock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
