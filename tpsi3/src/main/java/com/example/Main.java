package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("qunati conti hai");
        Scanner scan=new Scanner(System.in);
        conto c=new conto(scan.nextInt());
        scan.close();
        guadagna guadagnare=new guadagna(c);
        paga pagare=new paga(c);
        pagare.start();
        guadagnare.start();
        
    }
}