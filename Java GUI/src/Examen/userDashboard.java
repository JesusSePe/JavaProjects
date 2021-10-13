package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userDashboard {
    public static void main(String[] args) {
        new uDashboard(0);
    }
}
class uDashboard extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton opt1, opt2, opt3, opt4, logout;

    public uDashboard(int id) {
        frame = new JFrame();
        panel = new JPanel();

        // Creating buttons
        opt1 = new JButton("Modificar dades");
        opt2 = new JButton("Calcular punts");
        opt3 = new JButton("Afegir compra");
        opt4 = new JButton("Cambiar punts");
        logout = new JButton("Tancar sessió");

        // Adding events to buttons
        opt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] user = reader.userByID(id);
                new userData(user);
            }
        });

        opt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new calculadora();
            }
        });

        opt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ticket(id);
            }
        });

        opt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new premi(id);
            }
        });

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new loginpop();
            }
        });

        panel.setLayout(new GridLayout(5, 1));
        panel.add(opt1);
        panel.add(opt2);
        panel.add(opt3);
        panel.add(opt4);
        panel.add(logout);

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("User dashboard");
        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);

    }
}
class userData extends JFrame {
    private JFrame frame;
    private JPanel panel1, panel2, panel3;
    private JLabel name, lastnames, nif, usr, pwd;
    private JTextField txtname, txtlast, txtnif, txtusr;
    private JButton ok, cancel;
    private JPasswordField txtpwd;

    public userData(String[] data) {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        // Adding labels
        name = new JLabel("Nom: ");
        lastnames = new JLabel("Cognoms");
        nif = new JLabel("Nif");
        usr = new JLabel("Nom d'usuari: ");
        pwd = new JLabel("Contrassenya");

        // Adding text fields
        txtname = new JTextField(data[1]);
        txtlast= new JTextField(data[2]);
        txtnif = new JTextField(data[3]);
        txtusr = new JTextField(data[4]);
        txtpwd = new JPasswordField(data[5]);

        // Adding buttons
        ok = new JButton("Acceptar");
        cancel = new JButton("Cancelar");

        // Adding listeners to buttons
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtname.getText().equals("") || txtname.getText().equals(" ") || txtlast.getText().equals("") || txtlast.getText().equals(" ") || txtnif.getText().equals("") || txtnif.getText().equals(" ") || txtusr.getText().equals("") || txtusr.getText().equals(" ") || String.valueOf(txtpwd.getPassword()).equals("") || String.valueOf(txtpwd.getPassword()).equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Cap camp pot ser buit!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String[] info = {data[0], txtname.getText(), txtlast.getText(), txtnif.getText(), txtusr.getText(), String.valueOf(txtpwd.getPassword()), data[6]};
                    writter.update(data[0], info);
                    frame. dispose();
                }

            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame. dispose();
            }
        });

        panel1.setLayout(new GridLayout(5, 1));
        panel1.add(name);
        panel1.add(lastnames);
        panel1.add(nif);
        panel1.add(usr);
        panel1.add(pwd);

        panel2.setLayout(new GridLayout(5, 1));
        panel2.add(txtname);
        panel2.add(txtlast);
        panel2.add(txtnif);
        panel2.add(txtusr);
        panel2.add(txtpwd);

        panel3.add(ok);
        panel3.add(cancel);

        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Informació del usuari");
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
}

class calculadora extends JFrame{
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel txt;
    private JTextField importCompra;
    private JButton ok, cancel;

    public calculadora() {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();

        // Adding labels
        txt = new JLabel("Import: ");

        // Adding text fields
        importCompra = new JTextField();

        // Adding buttons
        ok = new JButton("Calcular");
        cancel = new JButton("Cancelar");

        // Adding listeners to buttons
        ok.addActionListener(e -> {
            int punts = 0;
            try {
                int preu = Integer.parseInt(importCompra.getText());
                int extra = 0;
                // 100€ bonus
                if (preu > 100) {
                    extra += 3;
                }
                // 500€ bonus
                if (preu > 500) {
                    extra += 50;
                }
                // 1 pts for each 10€ invested
                while (preu >= 10) {
                    punts += 1;
                    preu -= 10;
                }
                punts += extra;

                JOptionPane.showMessageDialog(null, "Amb aquesta compra obtindries " + punts + " punts");
            } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "El import de la compra ha de ser un número enter!");
            }

        });

        cancel.addActionListener(e -> frame. dispose());

        panel1.setLayout(new GridLayout(1, 2));
        panel1.add(txt);
        panel1.add(importCompra);

        panel2.setLayout(new GridLayout(1, 2));
        panel2.add(ok);
        panel2.add(cancel);

        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setTitle("Calculadora de punts");
        frame.setSize(350, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ticket extends JFrame{
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel lticket, limport;
    private JTextField txtticket, txtimport;
    private JButton ok, cancel;

    public ticket(int id) {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();

        // Adding labels
        lticket = new JLabel("Numero de tiquet: ");
        limport = new JLabel("Import: ");

        // Adding text fields
        txtticket = new JTextField();
        txtimport = new JTextField();

        // Adding buttons
        ok = new JButton("Calcular");
        cancel = new JButton("Cancelar");

        // Adding listeners to buttons
        ok.addActionListener(e -> {
            int punts = 0;
            try {
                if (!String.valueOf(txtticket).equals("")) {
                    int preu = Integer.valueOf(txtimport.getText());
                    int extra = 0;
                    // 100€ bonus
                    if (preu > 100) {
                        extra += 3;
                    }
                    // 500€ bonus
                    if (preu > 500) {
                        extra += 50;
                    }
                    // 1 pts for each 10€ invested
                    while (preu >= 10) {
                        punts += 1;
                        preu -= 10;
                    }
                    punts += extra;
                    String[] user = reader.userByID(id);
                    punts += Integer.parseInt(user[6]);
                    user[6] = String.valueOf(punts);
                    writter.update(String.valueOf(id), user);
                    frame. dispose();
                    JOptionPane.showMessageDialog(null, "Tiquet valid. Saldo de punts: " + punts);
                } else {
                    JOptionPane.showMessageDialog(null, "Tiquet no valid.");
                }
            } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "El import de la compra ha de ser un número enter!");
            }
        });

        cancel.addActionListener(e -> frame. dispose());

        panel1.setLayout(new GridLayout(2, 2));
        panel1.add(lticket);
        panel1.add(txtticket);
        panel1.add(limport);
        panel1.add(txtimport);

        panel2.setLayout(new GridLayout(1, 2));
        panel2.add(ok);
        panel2.add(cancel);

        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setTitle("Nou tiquet");
        frame.setSize(350, 120);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}

class premi extends JFrame {

    public premi(int id) {
        String[] user = reader.userByID(id);
        int pts = Integer.parseInt(user[6]);
        String premi = "una gorra";
        if (pts > 100 ){
            premi = "una ampolla de vi";
            if (pts > 500) {
                premi = "30% de descompte a la propera compra";
                if (pts > 1000) {
                    premi = "2 entrades a Port Aventura";
                }
            }
        }
        int optn = JOptionPane.showConfirmDialog(null, "Pots bescambiar els teus punts per "+premi);
        if (optn == 0) {
            user[6] = String.valueOf(0);
            writter.update(String.valueOf(id), user);
            JOptionPane.showMessageDialog(null, "Premi bescambiat. El rebras a la propera visita a la botiga. El saldo ara es de 0 pts");
        } else {
            JOptionPane.showMessageDialog(null, "Premi no bescambiat.");
        }
    }
}