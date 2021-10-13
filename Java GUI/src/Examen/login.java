package Examen;

import javax.swing.*;
import java.awt.*;

public class login {
    public static void main(String[] args) {
        new loginpop();
    }
}
class loginpop extends JFrame {
    public loginpop() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JPanel label = new JPanel(new GridLayout(0, 1, 3, 3));
        label.add(new JLabel("Usuari", SwingConstants.RIGHT));
        label.add(new JLabel("Contrassenya", SwingConstants.RIGHT));
        panel.add(label, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 3, 3));
        JTextField username = new JTextField();
        controls.add(username);
        JPasswordField password = new JPasswordField();
        controls.add(password);
        panel.add(controls, BorderLayout.CENTER);
        String user, pass;
        int res = JOptionPane.showOptionDialog(null, panel, "login", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Inicia sessio", "Registrar-me"}, "Inicia sessio");
        if (res == -1) {
            System.exit(0);
        } else if (res == 0) {
            user = username.getText();
            pass = String.valueOf(password.getPassword());
            if (user.equals("admin") && pass.equals("admin")) {
                this.dispose();
                new aDashboard();
                return;
            }
            String[] usr = reader.userLogin(user, pass);
            if (usr.length != 7 ){
                JOptionPane.showMessageDialog(null, "Usuari no trobat");
                new loginpop();
            } else {
                JOptionPane.showMessageDialog(null, "Benvingut "+usr[1]);
                this.dispose();
                new uDashboard(Integer.parseInt(usr[0]));
            }
        } else {
            new register();
        }
    }
}
class register extends JFrame {
    public register() {
        JPanel panel = new JPanel(new BorderLayout(7, 7));

        JPanel label = new JPanel(new GridLayout(0, 1, 6, 6));
        label.add(new JLabel("Nom", SwingConstants.RIGHT));
        label.add(new JLabel("Cognoms", SwingConstants.RIGHT));
        label.add(new JLabel("NIF", SwingConstants.RIGHT));
        label.add(new JLabel("Nom d'usuari", SwingConstants.RIGHT));
        label.add(new JLabel("Contrassenya", SwingConstants.RIGHT));
        panel.add(label, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 6, 6));
        JTextField nom = new JTextField();
        controls.add(nom);
        JTextField cognoms = new JTextField();
        controls.add(cognoms);
        JTextField nif = new JTextField();
        controls.add(nif);
        JTextField username = new JTextField();
        controls.add(username);
        JPasswordField password = new JPasswordField();
        controls.add(password);
        panel.add(controls, BorderLayout.CENTER);

        int res = JOptionPane.showOptionDialog(null, panel, "Registre", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Registrar-me", "Inicia sessio"}, "Registrar-me");

        if (res == -1) {
            System.exit(0);
        } else if (res == 0) {
            String[] usr = {nom.getText(), cognoms.getText(), nif.getText(), username.getText(), String.valueOf(password.getPassword())};
            for (String s : usr) {
                if (s.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Dades no valides.");
                    new register();
                }
            }
            int add = writter.add(usr);
            if (add == 0) {
                JOptionPane.showMessageDialog(null, "Benvingut "+usr[0]);
                this.dispose();
                String id = (reader.userLogin(usr[3], usr[4]))[0];
                new uDashboard(Integer.parseInt(id));
            }
        } else {
            new loginpop();
        }
    }
}