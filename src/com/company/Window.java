package com.company;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    private JLabel label;
    private JButton button;
    private JTextField textField;

    Window() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        //this.setVisible(true);
        this.setTitle("Cryptocurrency Prices");

        label = new JLabel("Label");
        button = new JButton("Refresh");
        textField = new JTextField(15);

        this.add(label);
        //this.add(textField);
        this.add(button);
        this.setVisible(true);
        this.pack();
    }

}
