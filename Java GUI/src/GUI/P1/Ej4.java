package GUI.P1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej4 {
    public static void main (String[] args) {
        new CheckBoxes2();
    }
}

class CheckBoxes2 extends JFrame {
    public CheckBoxes2() {
        super("Checkboxes");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        final JLabel label2 = new JLabel();

        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setSize(50,50);

        // Defining checkboxes
        JCheckBox checkbox1 = new JCheckBox("Color");
        checkbox1.setBounds(400,0,100,15);
        JCheckBox checkbox2 = new JCheckBox("Negreta");
        checkbox2.setBounds(400,15,100,15);
        JCheckBox checkbox3 = new JCheckBox("Inclinada");
        checkbox3.setBounds(400,30,100,15);
        JCheckBox checkbox4 = new JCheckBox("Gran");
        checkbox4.setBounds(400,45,100,15);

        // Defining label2
        label2.setHorizontalAlignment(JLabel.LEFT);
        label2.setBounds(0,0,100,15);
        label2.setText("Juguem amb checkBoxes...");
        label2.setOpaque(true);

        // Defining events
        checkbox1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Color Red = Color.red;
                        if (label2.getBackground() != Red) {
                            label2.setBackground(Color.red);
                        } else {
                            label2.setBackground(Color.white);
                        }
                    }
                }
        );
        checkbox2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Font f = label2.getFont();
                        label2.setFont(f.deriveFont(f.getStyle() ^ Font.BOLD));
                    }
                }
        );
        checkbox3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Font f = label2.getFont();
                        label2.setFont(f.deriveFont(f.getStyle() ^ Font.ITALIC));
                    }
                }
        );
        checkbox4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Font f = label2.getFont();
                        if (f.getSize() < 20) {
                            label2.setFont(new Font(f.getFamily(), f.getStyle(), f.getSize()*2));
                        } else {
                            label2.setFont(new Font(f.getFamily(), f.getStyle(), f.getSize()/2));
                        }
                    }
                }
        );

        // Adding everything
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
        add(label);
        add(label2);

        this.setSize(500,110);
        this.setResizable(false);

        this.setVisible(true);
    }
}

