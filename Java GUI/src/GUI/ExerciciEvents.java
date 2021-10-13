package GUI;


import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class ExerciciEvents {

    public static void main(String[] args) {

        new VentanaVariosEventos();
    }

}

class VentanaVariosEventos extends JFrame{
    private JPanel panel1,panel2;
    private JButton botonRojo,botonVerde;
    private JLabel contrassenya,nom,avis;
    private JTextField jtTexto;
    private JPasswordField password;

    public VentanaVariosEventos() {
        this.setSize(300, 180);
        this.setTitle("VARIOS EVENTOS");
        panel1=new JPanel();
        panel1.setLayout(new GridLayout(2,2));
        panel2=new JPanel();
        password=new JPasswordField(10);
        nom=new JLabel("NOM: ");
        jtTexto=new JTextField(10);
        contrassenya=new JLabel("CONTRASSENYA:");
        avis=new JLabel("La contrassenya: entre 8 i 10 caracters");

        panel1.add(nom);
        panel1.add(jtTexto);
        panel1.add(contrassenya);
        panel1.add(password);
        avis.setVisible(false); // Sólo es visible cuando gane el foco el cuadrdo de texto para introducir el password
        botonRojo=new JButton("COLOR ROJO");
        botonVerde=new JButton("COLOR VERDE");
        nom.setOpaque(true);
        contrassenya.setOpaque(true);

        // Añadir action listener a los botones
        botonRojo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nom.setBackground(new Color(255, 0, 0));
                        contrassenya.setBackground(Color.red);
                    }
                }
        );
        botonVerde.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nom.setBackground(Color.green);
                        contrassenya.setBackground(Color.green);
                    }
                }
        );


        password.setFocusable(true);
        password.addFocusListener(
                new FocusListener() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        avis.setVisible(true);
                    }

                    @Override
                    public void focusLost(FocusEvent e) {
                        avis.setVisible(false);
                    }
                }
        );

        panel2.add(botonRojo);
        panel2.add(botonVerde);
        this.add(panel1,BorderLayout.NORTH);
        this.add(avis,BorderLayout.CENTER);
        this.add(panel2,BorderLayout.SOUTH);

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }



}