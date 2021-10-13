package GUI.P2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ex3 {
    public static void main(String[] args) {
        new Ex();
    }
}

class Ex extends JFrame{
    private JFrame frame;
    private JPanel panel1, panel2,panel3;
    private JLabel label1,imagen;
    private JRadioButton computadora,llave,usuario,cliente,nota;
    private ButtonGroup grupo;

    public Ex() {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        grupo = new ButtonGroup();
        imagen = new JLabel();

        label1 = new JLabel("Selecciona una opcion para ver la imagen.");

        computadora = new JRadioButton("Computadora");
        computadora.addActionListener(
            new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                  imagen.setIcon(new ImageIcon("src/GUI/P2/img/megumin.jpg"));
                  imagen.setBounds(50, 50, 50, 50);
                }
            }
        );
        llave = new JRadioButton("Llave");
        llave.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imagen.setIcon(new ImageIcon("src/GUI/P2/img/toga.png"));
                }
            }
        );
        usuario = new JRadioButton("Usuario");
        usuario.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  imagen.setIcon(new ImageIcon("src/GUI/P2/img/dog.png"));
                }
            }
        );
        cliente = new JRadioButton("Cliente");
        cliente.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  imagen.setIcon(new ImageIcon("src/GUI/P2/img/week.jpg"));
                }
            }
        );
        nota = new JRadioButton("Nota", false);
        nota.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   imagen.setIcon(new ImageIcon("src/GUI/P2/img/EzCal.png"));
                }
            }
        );
        grupo.add(computadora);
        grupo.add(llave);
        grupo.add(usuario);
        grupo.add(cliente);
        grupo.add(nota);

        panel1.add(label1);

        panel2.setLayout(new GridLayout(0, 1));
        panel2.add(computadora);
        panel2.add(llave);
        panel2.add(usuario);
        panel2.add(cliente);
        panel2.add(nota);

        panel3.add(imagen);

        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.PAGE_START);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);
        frame.setTitle("Uso de JRadioButton");
        frame.setSize(700, 450);
        frame.setVisible(true);

    }
}
