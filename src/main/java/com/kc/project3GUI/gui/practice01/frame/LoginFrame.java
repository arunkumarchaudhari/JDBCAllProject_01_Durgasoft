package com.kc.project3GUI.gui.practice01.frame;

import java.awt.*;

public class LoginFrame extends Frame {
    public LoginFrame(){
        this.setVisible(true);
        this.setSize(500, 400);
        this.setTitle("Login Frame");
        this.setBackground(Color.DARK_GRAY);

    }

    @Override
    public void paint(Graphics g){
        g.drawString("Welcome to Login Frame", 100, 100);
    }
}
