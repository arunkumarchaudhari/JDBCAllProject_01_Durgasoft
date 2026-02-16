package com.kc.project3GUI.gui.practice01.frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * class WindowListenerImpl implements WindowListener ->
 *          Because of this, we need to override all the methods even if it is not used.
 *          So we should use existing class WindowAdapter which implements all the methods with dummy implementation and
 *          we can override only the method we want to use.
 *
 *      => Or we can use annonymous inner class to avoid creating new class  for WindowListenerImpl.
 */

//To close frame
//class WindowListenerImpl extends WindowAdapter {
//    @Override
//    public void windowClosing(WindowEvent windowEvent) {
//        System.exit(0);
//    }
//}

public class LogoFrame extends Frame {
    public LogoFrame(){
        this.setVisible(true);
        this.setTitle("Logo Frame");
        this.setSize(500, 400);
        this.setBackground(Color.GRAY);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.drawString("Welcome to Logo Frame", 100, 100);
    }
}
