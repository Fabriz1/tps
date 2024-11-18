package com.example;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;


import javax.swing.JFrame;


public class keylistener extends JFrame implements KeyListener {
    

    public keylistener() {

        setTitle("apri file con 0");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_0) {
            File file = new File("contobancario.txt");
            try {
                java.awt.Desktop.getDesktop().open(file);
            } catch (IOException e1) {

                e1.printStackTrace();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    
}
