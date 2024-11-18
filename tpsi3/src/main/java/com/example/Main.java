package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int i;
        System.out.println("qunati conti hai");
        Scanner scan = new Scanner(System.in);
        conto c = new conto(i=scan.nextInt());
        scan.close();
        apri_file a = new apri_file();
        guadagna guadagnare = new guadagna(c);
        paga pagare = new paga(c);
        pagare.start();
        guadagnare.start();
        a.start();

    }
}