package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminDashboard {
    public static void main(String[] args) {
        new aDashboard();
    }
}

class aDashboard extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton opt1, opt2, logout;

    public aDashboard() {
        frame = new JFrame();
        panel = new JPanel();

        // Creating buttons
        opt1 = new JButton("Clients fidels");
        opt2 = new JButton("Buscar per nom");
        logout = new JButton("Tancar sessió");

        // Adding events to buttons
        opt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new displayUsers();
            }
        });

        opt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new search();
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
        panel.add(logout);

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Admin dashboard");
        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
class displayUsers extends JFrame {
    public displayUsers() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        JPanel controls = new JPanel(new GridLayout(0, 1, 3, 3));

        Object[] users = reader.allUsers();

        JList list = new JList(users);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(-1);
        JScrollPane listScroll = new JScrollPane(list);
        //listScroll.setPreferredSize(new Dimension(10, 150));
        controls.add(list, BorderLayout.CENTER);
        list.add(listScroll, BorderLayout.EAST);

        panel.add(controls, BorderLayout.CENTER);
        JOptionPane.showMessageDialog(null, panel, "users", JOptionPane.QUESTION_MESSAGE);
    }
}

class search extends JFrame {
    public search() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JPanel label = new JPanel(new GridLayout(0, 1, 3, 3));
        label.add(new JLabel("Nom", SwingConstants.RIGHT));
        label.add(new JLabel("Cognoms", SwingConstants.RIGHT));
        panel.add(label, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 3, 3));
        JTextField name = new JTextField();
        controls.add(name);
        JTextField last = new JTextField();
        controls.add(last);
        panel.add(controls, BorderLayout.CENTER);
        int res = JOptionPane.showOptionDialog(null, panel, "Busqueda", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Buscar", "Cancela"}, "Busca");
        if (res == 0) {
            String uname = name.getText();
            String lname = last.getText();
            String[] usr = reader.userByName(uname, lname);
            if (usr.length != 7 ){
                JOptionPane.showMessageDialog(null, "Usuari no trobat");
                new search();
            } else {
                JOptionPane.showMessageDialog(null, "Total de punts: "+usr[6]);
            }
        } else {
            new search();
        }
    }
}

