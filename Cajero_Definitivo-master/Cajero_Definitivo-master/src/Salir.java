import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Salir extends JFrame {

    private int ancho = 300;
    private int largo = 200;
    private JPanel panel;
    private JLabel e;
    private JButton b;
    private JButton b2;

    public Salir() {
        this.setSize(ancho, largo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Salir");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        paneles();
    }

    public void paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel).setBackground(Color.cyan);
        ;
        eti();
        botones();
    }

    public void eti() {
        e = new JLabel();
        e.setBounds(80, 30, 180, 20);
        e.setText("sesion cerrada ");
        e.setFont(new Font("arial", Font.BOLD, 18));
        panel.add(e);
    }

    public void botones() {
        b = new JButton();
        b.setBounds(100, 80, 80, 50);
        b.setText("ok");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio obj = new Inicio();
                obj.setVisible(true);
                setVisible(false);
            }

        });
        panel.add(b);

    }

}
