/*
Ejemplo de Clase anónima en una interfaz gráfic
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G_Ejemplo {

    public static void main(String[] args) {
        // Crear ventana
        JFrame ventana = new JFrame("Mi Ventana");
        ventana.setSize(500, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botón
        JButton boton = new JButton("Haz clock aquí");

        // Agregar ActionListener con clase anónima
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Botón clicado!");
            }
        });

        // Agregar botón a la ventana
        ventana.add(boton);
        ventana.setVisible(true);


    }
}
