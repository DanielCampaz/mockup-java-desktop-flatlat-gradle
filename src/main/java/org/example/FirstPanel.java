package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel {

    public FirstPanel() {
        super();
        init();
    }

    private void init() {
        this.setVisible(true);
        JLabel label1 = new JLabel("First Text");
        add(label1);

        JButton button = new JButton("Change");
        button.setSize(20,10);
        button.putClientProperty("JButton.buttonType", "roundRect");
        button.addActionListener(new ActionListener() {
            boolean state = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(state) {
                    label1.setText("First Text");
                    state = false;
                } else {
                    label1.setText("Second Text");
                    state = true;
                }
            }
        });

        add(button);
    }
}
