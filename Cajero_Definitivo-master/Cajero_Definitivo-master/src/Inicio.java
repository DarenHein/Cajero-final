import javax.swing.JFrame;
import javax.swing.event.AncestorListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Inicio extends JFrame {

    private JPanel panel;
    private JButton boton;
    private JLabel eti;
    private int ancho = 300;
    private int largo = 300;

    public Inicio() {

        this.setSize(ancho, largo);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inicio");
        this.setLocationRelativeTo(null);
        paneles();

    }

    public void paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel).setBackground(Color.cyan);
        ;
        etiquetas();
        botones();
    }

    public void etiquetas() {
        // aqui pon la imagen
        eti = new JLabel();
    }

    public void botones() {
        boton = new JButton();
        boton.setBounds(100, 100, 120, 20);
        boton.setText("presioname");
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario obj = new Usuario();
                obj.setVisible(true);
                setVisible(false);
            }
        });
        panel.add(boton);
    }

}