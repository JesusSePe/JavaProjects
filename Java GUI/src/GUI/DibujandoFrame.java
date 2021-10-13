package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class DibujandoFrame {
    public static void main (String[] args){
        new Ventana();
    }
}
class Ventana extends JFrame {
    JButton limpiar;

    public Ventana() {
        initJFrame();
        initComponent();

        this.addMouseMotionListener(
                new MouseMotionListener() {
                    @Override
                    public void mouseDragged(MouseEvent e) {

                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {
                        int x = e.getX();
                        int y = e.getY();
                        Graphics g = getGraphics();

                        g.setColor(Color.green);
                        g.fillOval(x, y, 6, 6);
                    }
                }

        );
        limpiar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //repaint();
                        //int seleccion = JOptionPane.showOptionDialog(rootPane, "Desea eliminar el archivo?", "ELIMINAR", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Non't", "Yesn't"}, "Yesn't");
                        Object text = JOptionPane.showInputDialog(rootPane, "Escriba el nombre: ", "DATOS", JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"AWS1", "AWS2", "AMS1", "AMS2"}, "AWS2");
                    }
                }
        );
    }

    public void initJFrame() {
        setSize(500, 500);
        repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void initComponent() {
        limpiar = new JButton("Limpiar lienzo");
        add(limpiar, BorderLayout.SOUTH);
    }

    /*
    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.red);
        g2D.setStroke(new BasicStroke(10));

        g2D.drawLine(100,100,150,150);
        g2D.drawRoundRect(160, 160, 200, 300, 10, 10);

        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image imagen = pantalla.getImage("toga.png");
        g2D.drawImage(imagen, 100, 100, this);

        // Gradient
        GradientPaint p = new GradientPaint(150, 170, Color.BLUE, 300, 200, Color.red);
        g2D.setPaint(p);

        g2D.fillRect(150, 170, 200, 300);

    }
    */

}
