import java.awt.Color;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Usuario extends JFrame {

    
    private int ancho = 300;
    private int largo = 300;

    /**
     * 
     */
    public Usuario() {

        this.setSize(ancho, largo);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Login");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel).setBackground(Color.blue);

        ;

        // etiquetas
        /* luis aqui quiero que alla una etiqueta de tipo login */

        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(20, 10, 80, 150);
        etiqueta.setText(" usuario : ");
        etiqueta.setForeground(Color.black);
        panel.add(etiqueta);

        ;

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(20, 70, 110, 100);
        etiqueta2.setText("Contraseña : ");
        etiqueta2.setForeground(Color.black);
        panel.add(etiqueta2);
        ;

        JTextField campo = new JTextField();
        campo.setBounds(120, 75, 120, 20);
        panel.add(campo);

        JTextField campo2 = new JTextField();
        campo2.setBounds(120, 110, 120, 20);
        panel.add(campo2);

        JButton boton = new JButton();
        boton.setBounds(90, 170, 120, 20);
        boton.setText("Iniciar");
        // el icono del boton tambien cambialo
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campo.getText();
                String paswd = campo2.getText();

                if (usuario.isEmpty() || paswd.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Algún campo esta vacio");

                } else {
                    if (usuario.equals("Luis") && paswd.equals("1234")) {

                        Menu obj = new Menu(); 
                        obj.setVisible(true);
                        setVisible(false);

                    } else {
                        JOptionPane.showConfirmDialog(null, "Su usuario o contraseña es incorrecto");
                    }
                }
            }

        });
        panel.add(boton);

    }

}
