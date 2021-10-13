package GUI.P1;

import javax.swing.*;
import java.awt.*;

public class Ej3 {
    public static void main(String[] args) {
        new Componentes();
    }
}

class Componentes extends JFrame {
    private JTabbedPane panel1;
    private JLabel label1, label2, label3, label4, label5;
    private JPasswordField pass;
    private JTextField txt;
    private JList list;
    private JComboBox combo;
    private JRadioButton ra1, ra2, ra3;
    private JTextArea jta;

    public Componentes() {
        // Defining pane 1
        panel1 = new JTabbedPane();
        // Labels
        label1 = new JLabel("JTextField");
        label2 = new JLabel("JPasswordField");
        label3 = new JLabel("JTextArea");
        label4 = new JLabel("JLabel");
        label5 = new JLabel("Text");
        // Fields
        txt = new JTextField(10);
        pass = new JPasswordField(10);
        jta = new JTextArea();

        // Define pane2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4,2));
        // Add items to pane2
        panel2.add(label1);
        panel2.add(txt);
        panel2.add(label2);
        panel2.add(pass);
        panel2.add(label3);
        panel2.add(jta);
        panel2.add(label4);
        panel2.add(label5);

        // Add Tab
        panel1.addTab("Text", panel2);


        // Tab2, Panel 3
        JPanel panel3 = new JPanel();

        // Defining list
        String []items = {"item1", "item2", "item3"};
        list = new JList(items);

        // Add list to pane
        panel3.add(list);

        // Add list pane to general one
        panel1.addTab("JList", panel3);


        // Tab 3, Panel 4
        JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout());

        // Defining Radio Buttons
        JPanel panelRB = new JPanel();
        ra1 = new JRadioButton("Option 1");
        ra2 = new JRadioButton("Option 2");
        ra3 = new JRadioButton("Option 3");
        panelRB.add(ra1);
        panelRB.add(ra2);
        panelRB.add(ra3);
        // Defining Combo Box
        JPanel panelCB = new JPanel();
        combo = new JComboBox();
        combo.addItem("Ra");
        combo.addItem("Rasputin");
        combo.addItem("Lover");
        combo.addItem("Of");
        combo.addItem("The");
        combo.addItem("Russian");
        panelCB.add(combo);

        // Add items to panel 4
        panel4.add(panelRB, BorderLayout.WEST);
        panel4.add(panelCB, BorderLayout.EAST);

        // Add panel 4 to main one
        panel1.addTab("Escull", panel4);



        this.add(panel1);
        this.setTitle("Componentes");
        this.setSize(400, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
