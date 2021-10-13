package GUI.P1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej1 {
    public static void main (String[] args) {
        new CheckBoxes();
    }
}

class CheckBoxes extends JFrame{
    public CheckBoxes() {
        super("Checkboxes");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        final JLabel label2 = new JLabel();
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setSize(50,50);
        JCheckBox checkbox1 = new JCheckBox("Color");
        checkbox1.setBounds(200,0,100,15);
        JCheckBox checkbox2 = new JCheckBox("Negreta");
        checkbox2.setBounds(200,15,100,15);
        JCheckBox checkbox3 = new JCheckBox("Inclinada");
        checkbox3.setBounds(200,30,100,15);
        JCheckBox checkbox4 = new JCheckBox("Gran");
        checkbox4.setBounds(200,45,100,15);
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
        add(label);

        label2.setHorizontalAlignment(JLabel.LEFT);
        label2.setBounds(0,0,100,15);
        label2.setText("Juguem amb checkBoxes...");
        add(label2);
        this.setSize(300,110);
        this.setResizable(false);

        this.setVisible(true);
    }
}
