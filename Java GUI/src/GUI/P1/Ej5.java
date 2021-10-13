package GUI.P1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej5 {
    public static void main(String[] args) {
        new Aleatorio2();
    }
}

class Aleatorio2 extends JFrame {
    private JPanel data, buttons;
    private JButton activar, comprobar, salir;
    private JLabel numb1, numb2, res, intento, ac, fails;
    private JTextField num1, num2, intentos, aciertos, fallas, resultado;

    public Aleatorio2() {
        this.setSize(600, 100);
        this.setTitle("Aleatorio");
        data = new JPanel();
        data.setLayout(new GridLayout(2,6));
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,3));
        numb1 = new JLabel("Número 1:");
        // Set num1
        num1 = new JTextField(5);
        num1.setEditable(false);
        //num1.setText(String.valueOf((int) (Math.random() * 100)));

        // Set num2
        numb2 = new JLabel("+ Número 2:");
        num2 = new JTextField(5);
        num2.setEditable(false);
        //num2.setText(String.valueOf((int) (Math.random() * 100)));

        // Resultado
        res = new JLabel("= Resultado");
        resultado = new JTextField(6);

        // Set intentos
        intento = new JLabel("Intentos:");
        intentos = new JTextField(3);
        intentos.setEditable(false);

        // Set aciertos
        ac = new JLabel("Aciertos:");
        aciertos = new JTextField(3);
        aciertos.setEditable(false);

        // Set fallos
        fails = new JLabel("Fallas:");
        fallas = new JTextField(3);
        fallas.setEditable(false);


        // Botones
        activar = new JButton("Activar");
        comprobar = new JButton("Comprobar");
        salir = new JButton("Salir");

        // Comprobar resultado
        comprobar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Only works after pressing activar
                        if (!num1.getText().equals("")) {
                            int n1 = Integer.valueOf(num1.getText());
                            int n2 = Integer.valueOf(num2.getText());
                            int n3 = Integer.valueOf(resultado.getText());
                            if (n1 + n2 == n3) {
                                aciertos.setText(String.valueOf(Integer.valueOf(aciertos.getText() + 1)));
                                num1.setText(String.valueOf((int) (Math.random() * 100)));
                                num2.setText(String.valueOf((int) (Math.random() * 100)));
                            } else {
                                intentos.setText(String.valueOf(Integer.valueOf(intentos.getText() + 1)));
                                fallas.setText(String.valueOf(Integer.valueOf(fallas.getText() + 1)));
                            }
                        }
                    }
                }
        );
        activar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        num1.setText(String.valueOf((int) (Math.random() * 100)));
                        num2.setText(String.valueOf((int) (Math.random() * 100)));
                        intentos.setText(String.valueOf(0));
                        aciertos.setText(String.valueOf(0));
                        fallas.setText(String.valueOf(0));
                    }
                }
        );
        salir.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                }
        );


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
