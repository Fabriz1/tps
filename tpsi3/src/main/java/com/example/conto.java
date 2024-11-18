package com.example;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class conto {
    int[] conto;
    int quantita;

    public conto(int i) {
        File file = new File("contobancario.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
        }
        this.conto = new int[i];
        for (int c = 0; c < i; c++) {
            this.conto[c] = 100;
        }
    }

    public void setConto(int i, int quantita) {
        this.quantita = quantita;
        if (quantita < 0) {
            try {
                file("pagare");
            } catch (IOException e) {

                e.printStackTrace();
            }
        } else {
            try {
                file("guadagnare");
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        this.conto[i] += quantita;

    }

    public int getConto(int i) {
        return conto[i];
    }

    public void file(String qualificatore) throws IOException {
        FileWriter aggiungi_linea = new FileWriter("contobancario.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(aggiungi_linea);
        bufferedWriter.newLine();
        switch (qualificatore) {
            case "pagare":
                bufferedWriter.write("pagamento:   " + this.quantita);
                break;

            case "guadagnare":
                bufferedWriter.write("incasso:   " + this.quantita);
                break;
        }
        bufferedWriter.close();

    }

}
