package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraPrincipal {
    public static void main (String[] args) {
        new VentanaCalculadora();

    }
}

class PanelSuperior extends JPanel{
    JTextArea jta;

    public PanelSuperior() {
        jta = new JTextArea();
        jta.setEditable(false);
        add(jta);
    }
}

class PanelInferior extends JPanel{
    JButton botones[] = new JButton[12];

    public PanelInferior() {
        initComponent();
        setLayout(new GridLayout(4,3));

        for(int i=0;i<botones.length;i++) {
            add(botones[i]);
        }
    }
    public void initComponent() {
        for (int i=0;i<10;i++){
            botones[i]=new JButton(""+i);
        }
        botones[10] = new JButton("+");
        botones[11] = new JButton("=");
    }
}

class VentanaCalculadora extends JFrame implements ActionListener {
    PanelInferior pi;
    PanelSuperior ps;
    public VentanaCalculadora() {
        this.setTitle("Pointless calculator"); // Título de ventana
        ps = new PanelSuperior();
        pi = new PanelInferior();
        ps.jta.setText("");
        setSize(300, 300);

        // Centramos la ventana
        Toolkit pantalla = Toolkit.getDefaultToolkit(); // Obtenemos las propiedades de Toolkit y las guardamos en pantalla
        Dimension grandaria = pantalla.getScreenSize();
        int anchura = grandaria.width;
        int altura = grandaria.height;
        this.setLocation((anchura/2)-(this.getWidth()), (altura/2)-(this.getHeight())); //Se centra la ventana

        // Añadir un listener a los botones.
        for (int i=0;i<pi.botones.length;i++) {
            pi.botones[i].addActionListener(this);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acabar el programa al cerrar la ventana.
        this.setResizable(false); // Por defecto, se puede redimensionar. Esto anula dicha propiedad.

        // Añadimos los componentes
        add(ps, BorderLayout.NORTH);
        add(pi, BorderLayout.CENTER);

        // Ventana visible
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();

        if(!boton.getText().equals("=")) {
            ps.jta.setText(ps.jta.getText()+boton.getText());
        } else {
            String [] numeros = ps.jta.getText().split("\\+");

            int total = 0;
            for (int i=0; i<numeros.length;i++) {
                total+=Integer.valueOf(numeros[i]);
            }
            ps.jta.setText(String.valueOf(total));
        }
    }
}