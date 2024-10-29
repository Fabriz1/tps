/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpsi;

import java.util.Random;

/**
 *
 * @author fabri
 */
class guadagna {

    int i;

    guadagna() {
        conto c = new conto(2);
        this.i = c.getdato();
        this.guadagno_random();
    }

    private void guadagno_random() {
        int[] carta = new int[2];// nel primo posto andrà i soldi da caricare sulla carta nel secondo su quale
                                 // conto andranno
        Random rand = new Random();
        conto scrivi = new conto();
        while (true) {
            carta[1] = rand.nextInt(i);
            carta[0] = rand.nextInt(1000);
            scrivi.guadagna(carta);
        }
    }

}
