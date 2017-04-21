package ventana;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class VentanaEjemplo1{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        JFrame ventana = new JFrame("PROBANDO");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea areaTexto1 = new JTextArea(10,50);
        JTextField areaTexto2 = new JTextField(40);
        areaTexto1.setLineWrap(true);
        areaTexto1.setEditable(false);
        ventana.add(areaTexto1, BorderLayout.NORTH);
        ventana.add(areaTexto2, BorderLayout.SOUTH);
        ventana.pack();//método utilizado para que se muestren los //elementos de la ventana 
        ventana.setVisible(true);

    }
} 