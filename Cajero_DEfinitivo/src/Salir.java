import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class Salir extends JFrame {

    private int ancho = 300; 
    private int largo = 200; 
    private JPanel panel ; 
    private JLabel e;
    private JButton b; 
    private JButton b2; 
    
    public Salir(){
        this.setSize(ancho,largo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Salir");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        paneles(); 
    }
    public void paneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel); 
        eti(); 
        botones(); 
    }
    public void eti(){
        e = new JLabel(); 
        e.setBounds(85, 30, 120, 20);
        e.setText("¿Desea salir?");
        e.setFont(new Font("arial",Font.BOLD,18));
        panel.add(e); 
    }
    public void botones(){
        b = new JButton(); 
        b.setBounds(30, 80, 80, 20);
        b.setText("Si");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Inicio obj = new Inicio(); 
               obj.setVisible(true);
               setVisible(false);
            }
            
        });
        panel.add(b); 

        b2 = new JButton(); 
        b2.setBounds(180, 80, 80, 20);
        b2.setText("No");
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Menu obj2 = new Menu(); 
                obj2.setVisible(true);
                setVisible(false);
            }
            
        });
        panel.add(b2); 
        
    }
    
}
