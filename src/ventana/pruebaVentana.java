package Ventana;

import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

/**
 *
 * @autor Santiago Losada Borrajo
 */

public class pruebaVentana extends JFrame {

    public static void main (String args[]) {
        JFrame MiVentana = new JFrame("MI PRIMER VENTANA" ); //llamamos a la clase y creamos un objeto llamado MiVentana
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JTextArea areaDeEscritura = new JTextArea (200, 200);
        areaDeEscritura.setLineWrap(true);
        areaDeEscritura.setWrapStyleWord(true);
        barraMenu.add(menu);
        MiVentana.setVisible(true);//le decimos al compilador que queremos que se vea la ventana 
        MiVentana.setSize(200,200);//le damos el tamaño deseado a nuestra ventana
        MiVentana.setJMenuBar(barraMenu);
        MiVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);//le decimos que al dar clic en la X se cierre nuestra ventana
        MiVentana.setBackground(Color.yellow);
        areaDeEscritura.setEditable(true);
    }
}    
