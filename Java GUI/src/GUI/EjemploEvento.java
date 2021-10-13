package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploEvento {
    public static void main(String[] args) {
        new VentanaEvento();
    }
}
/* //Version using several classes
class VentanaEvento extends JFrame {
    PanelBoton panel;
    JButton boton;
    public VentanaEvento() {
        panel = new PanelBoton();
        setSize(400, 400);
        boton = new JButton("Canviar color");
        panel.add(boton);
        boton.addActionListener(panel);
        add(panel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}

class PanelBoton extends JPanel implements ActionListener {

    public PanelBoton() {

    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        this.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    }
}
 */
// One class version.
class VentanaEvento extends JFrame{
    JPanel panel;
    JButton boton;
    public VentanaEvento() {
        panel = new JPanel();
        setSize(400, 400);
        boton = new JButton("Canviar color");
        panel.add(boton);

        boton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        panel.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
                    }
                }
        );

        add(panel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}