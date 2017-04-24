package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEjemplo1{

    public static void main(String[] args) {
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
        
        
        areaTexto2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                areaTexto1.append("\n"+((JTextField)e.getSource()).getText());
                areaTexto2.setText("");
            }
        }
        );
    }
} 