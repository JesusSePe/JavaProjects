package GUI;
import javax.swing.*;
import java.awt.*;

public class MiPrimeraVentana {
    public static void main(String[] args) {
        new Marco(); // Creamos un nuevo marco. Especificado abajo cómo se crea.

    }
}

class Marco extends JFrame{
    // Tamaño por defecto es 0
    // No es visible
    // Se puede redimensionar
    // Se situa en el marco superior izquierdo
    JButton botones [] = new JButton[5];

    public Marco(){
        // super("Mi primera ventana"); // Título de ventana llamando al constructor padre.
        this.setTitle("Mi primera ventana"); // Título de ventana
        //setSize(200,400); // Tamaño de la ventana. No se cierra, sólo oculta la ventana
        this.setBounds(50, 100, 400, 200); // Especificar posición + tamaño

        // Creamos un icono para la ventana.
        Toolkit pantalla = Toolkit.getDefaultToolkit(); // Obtenemos las propiedades de Toolkit y las guardamos en pantalla
        Image imagen = pantalla.getImage("toga.png"); // A partir de pantalla, añadimos la ruta del archivo.
        this.setIconImage(imagen);

        // Centramos la ventana
        Dimension grandaria = pantalla.getScreenSize();
        int anchura = grandaria.width;
        int altura = grandaria.height;


        this.setLocation((anchura/2)-(this.getWidth()), (altura/2)-(this.getHeight()));





        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acabar el programa al cerrar la ventana.
        this.setResizable(false); // Por defecto, se puede redimensionar. Esto anula dicha propiedad.
        initComponent();
        this.add(botones[0], BorderLayout.NORTH);
        this.add(botones[1], BorderLayout.CENTER);
        this.add(botones[2], BorderLayout.WEST);
        this.add(botones[3], BorderLayout.SOUTH);
        this.add(botones[4], BorderLayout.EAST);
        this.setVisible(true); // Hacer que la ventana sea visible

    }

    public void initComponent() {
        botones [0] = new JButton("Boton NORTE");
        ImageIcon imagen = new ImageIcon("Toga.png");
        botones [1] = new JButton("Boton CENTRO");
        botones [2] = new JButton(imagen);
        botones [3] = new JButton("Boton SUR");
        botones [4] = new JButton("Boton ESTE");
    }
}