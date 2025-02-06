package com.mycompany.easymarket;

import javax.swing.JFrame;

public class EasyMarket {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("EasyMarket UI");
        NewJPanel panel = new NewJPanel();
        
        frame.add(panel);
        frame.setBounds(300, 200, 650, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
