package GUI.P2;

import javax.swing.*;

public class Ex1 {
    public static void main (String[] args){
        new PopUp();
    }
}
class PopUp extends JFrame {
    int num = 0;
    int total = 0;
    boolean exit = false;
    public PopUp() {
        while (!exit) {
            String StringNum = JOptionPane.showInputDialog("Introduce un número. En blanco para detener");
            try {
                num += 1;
                total += Integer.valueOf(StringNum);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El promedio es " + String.valueOf(total/num));
                exit = true;
            }
        }
    }
}
