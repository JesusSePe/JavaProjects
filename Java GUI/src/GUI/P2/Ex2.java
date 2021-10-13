package GUI.P2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex2 {
    public static void main (String[] args){
        new Ratoli();
    }
}
class Ratoli extends JFrame implements MouseListener{
    JButton esborrar;

    public Ratoli() {
        initJFrame();
        initComponent();

        this.addMouseListener(this);

        esborrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        repaint();
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
        esborrar = new JButton("Limpiar lienzo");
        add(esborrar, BorderLayout.SOUTH);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Graphics g = this.getGraphics();
        g.setColor(Color.red);
        g.fillOval(x, y, 6, 6);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
