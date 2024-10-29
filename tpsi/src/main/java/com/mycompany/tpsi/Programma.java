/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpsi;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
class Programma implements Runnable {
    Programma() {
        System.out.println("programma");
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("programma2");

        conto c = new conto();

        paga p = new paga();

        guadagna g = new guadagna();
    }
}
