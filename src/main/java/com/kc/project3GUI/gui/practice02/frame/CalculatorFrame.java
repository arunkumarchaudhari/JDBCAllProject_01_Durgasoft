package com.kc.project3GUI.gui.practice02.frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorFrame extends Frame implements ActionListener {
    Label label1, label2, label3;
    TextField textField1, textField2, textField3;
    Button button1, button2, button3;

    public CalculatorFrame(){
        this.setVisible(true);
        this.setSize(400,300);
        this.setTitle("Calculator");
        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        label1 = new Label("Number 1:   ");
        label2 = new Label("Number 2:   ");
        label3 = new Label("Result:     ");
        textField1 = new TextField(20);
        textField2 = new TextField(20);
        textField3 = new TextField(20);

        button1 = new Button("ADD");
        button2 = new Button("SUB");
        button3 = new Button("MUL");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        Font font = new Font("Arial", Font.BOLD, 20);
        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        textField1.setFont(font);
        textField2.setFont(font);
        textField3.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);

        this.add(label1); this.add(textField1);
        this.add(label2); this.add(textField2);
        this.add(label3); this.add(textField3);
        this.add(button1); this.add(button2); this.add(button3);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try{
            int val1 = Integer.parseInt(textField1.getText());
            int val2 = Integer.parseInt(textField2.getText());
            int res=0;
            String label = actionEvent.getActionCommand();
            if(label.equalsIgnoreCase("ADD")){
                res = val1 + val2;
            } else if(label.equalsIgnoreCase("SUB")){
                res = val1 - val2;
            } else if(label.equalsIgnoreCase("MUL")){
                res = val1 * val2;
            }
            textField3.setText(""+res);

        } catch (Exception e){
            e.printStackTrace();
            textField3.setText(e.getMessage());
        }
    }
}
