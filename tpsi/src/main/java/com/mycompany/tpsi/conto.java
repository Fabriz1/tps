/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpsi;

/**
 *
 * @author ospite
 */
class conto {
    int i;
    int[] conti;
    conto(){
        
    }
    conto(int i){
    conti=new int[i];
    for(int c=0;c<i;c++){
        conti[c]=1000;
    }
    }
    
    
    public void paga(int[] dati){
    conti[dati[1]]-=dati[0];
        System.out.println(conti[dati[1]]);    
    }

    void guadagna(int[] dati) {
    conti[dati[1]]+=dati[0];
    System.out.println(conti[dati[1]]);    
    }
    
    
    
}
