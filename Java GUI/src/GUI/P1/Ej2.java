package GUI.P1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej2 {
    public static void main(String[] args) {
        new Aleatorio();
    }
}

class Aleatorio extends JFrame{
    private JPanel data, buttons;
    private JButton activar, comprobar, salir;
    private JLabel numb1, numb2, res, intento, ac, fails;
    private JTextField num1, num2, intentos, aciertos, fallas, resultado;

    public Aleatorio() {
        this.setSize(600, 100);
        this.setTitle("Aleatorio");
        data = new JPanel();
        data.setLayout(new GridLayout(2,6));
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,3));
        numb1 = new JLabel("Número 1:");
        num1 = new JTextField(5);
        numb2 = new JLabel("+ Número 2:");
        num2 = new JTextField(5);
        res = new JLabel("= Resultado");
        resultado = new JTextField(6);
        intento = new JLabel("Intentos:");
        intentos = new JTextField(3);
        ac = new JLabel("Aciertos:");
        aciertos = new JTextField(3);
        fails = new JLabel("Fallas:");
        fallas = new JTextField(3);

        activar = new JButton("Activar");
        comprobar = new JButton("Comprobar");
        salir = new JButton("Salir");

        data.add(numb1);
        data.add(num1);
        data.add(numb2);
        data.add(num2);
        data.add(res);
        data.add(resultado);
        data.add(intento);
        data.add(intentos);
        data.add(ac);
        data.add(aciertos);
        data.add(fails);
        data.add(fallas);

        buttons.add(activar);
        buttons.add(comprobar);
        buttons.add(salir);

        this.add(data, BorderLayout.NORTH);
        this.add(buttons, BorderLayout.SOUTH);

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}