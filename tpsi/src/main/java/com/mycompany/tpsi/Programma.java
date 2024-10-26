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
class Programma implements Runnable{
Programma(){
    System.out.println("proframma");
    Thread thread = new Thread(this);  
 thread.start();
}   

    @Override
    public void run() {
        System.out.println("programma2");
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        conto c=new conto(i);
        
        paga p=new paga(i);
        
        guadagna g=new guadagna(i);
    }
}
