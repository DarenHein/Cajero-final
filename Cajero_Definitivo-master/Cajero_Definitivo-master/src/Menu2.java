import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class Menu2 extends JFrame {

    private JPanel panel ,panel2 ; 
    private JLabel e,e2,e3,e4,e5,e6,e7; 
    private JButton b1,b2,b3,b4,b5; 
    private JTextField c,c2,c3,c4; 
    private int ancho = 500; 
    private int largo = 500; 


    public Menu2 (){
        this.setSize(ancho,largo); 
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Menu");
        paneles(); 
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        this.getContentPane().add(panel); 

        panel2 = new JPanel(); 
        panel2.setLayout(null);
        panel2.setBackground(Color.cyan);
        panel2.setBounds(150,150,300,300); 
        panel.add(panel2); 
        etis(); 
        botones(); 
        campos(); 

    }
    public void etis(){

        e = new JLabel("Cajero Dexter Bank"); 
        e.setBounds(150,70, 230, 20);
        e.setFont(new Font("arial",Font.BOLD,22));         
        panel.add(e); 

        e3 = new JLabel("Saldo : ");
        e3.setBounds(50,100,120,20);
        panel2.add(e3); 

        // ---------------- apartado de depositos 

        e2 = new JLabel("Deposito");// principal
        e2.setBounds(100, 20, 120, 20);
        e2.setFont(new Font("arial",Font.BOLD,17)); 
        e2.setVisible(false);
        panel2.add(e2); 

        e4 = new JLabel("Deposito : ");// referencia
        e4.setBounds(50,130,120,20);
        e4.setVisible(false);
        panel2.add(e4); 

        // ----------------- apartado retiros 

        e7 = new JLabel("Retiro");// principal
        e7.setBounds(100, 20, 120, 20);
        e7.setFont(new Font("arial",Font.BOLD,17)); 
        e7.setVisible(false);
        panel2.add(e7); 

        e6 = new JLabel("Retiro : ");// referencia
        e6.setBounds(50,130,120,20);
        e6.setVisible(false);
        panel2.add(e6); 


        



    }
    public void campos(){

        //------------- apartado saldo 
        c = new JTextField("20"); 
        c.setBounds(150, 100, 120, 20);
        c.setEditable(false);
        panel2.add(c); 
        // aparatdo de deposito 
        c2 = new JTextField(); 
        c2.setBounds(150, 130, 120, 20);
        c2.setVisible(false);
        panel2.add(c2); 
        // aparatado retiros
        c3 = new JTextField(); 
        c3.setBounds(150, 130, 120, 20);
        c3.setVisible(false);
        panel2.add(c3); 
        

    }
    public void botones(){

        // ----------- apartado de visualissaciones 

        b1 = new JButton("Depositos");
        b1.setBounds(30,200,120,20);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // ---- que se vean 
                e2.setVisible(true);
                e4.setVisible(true);
                c2.setVisible(true);
                b2.setVisible(true);
                // ---- que no se vean 
                e6.setVisible(false);
                e7.setVisible(false);
                c3.setVisible(false);
                b4.setVisible(false);
                
               
            }
            
        });
        panel.add(b1) ; 

        b3 = new JButton("Retiros");
        b3.setBounds(30,230,120,20);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                // ---- que no se vean 
                e2.setVisible(false);
                e4.setVisible(false);
                c2.setVisible(false);
                b2.setVisible(false);
                // ---- que se vean 
                e6.setVisible(true);
                e7.setVisible(true);
                c3.setVisible(true);
                b4.setVisible(true);
            }
            
        });
        panel.add(b3) ; 

        b5 = new JButton("Salir"); 
        b5.setBounds(30,260,120,20);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              Salir obj = new Salir(); 
              obj.setVisible(true);
              setVisible(false);
            }
            
        });
        panel.add(b5); 
        

        // -------------------- apartado de acciones 
        b2 = new JButton("Depositar saldo"); 
        b2.setBounds(100,200,120,20); 
        b2.setVisible(false);
        b2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              try {
                String csaldo = c.getText(); 
                int num = Integer.parseInt(csaldo); 
                String cdepo = c2.getText(); 
                int num2 = Integer.parseInt(cdepo); 
                int resultado = num + num2; 
                String resultado2 = String.valueOf(resultado); 
                c.setText(resultado2);
                c2.setText(""); 
                JOptionPane.showMessageDialog(null,"Ticket \nSaldo anterior : $ " + csaldo + "\nSaldo actual : $ " + resultado2 + "\nDeposito : $ " + cdepo + "\nGracias ");
              } catch (Exception e12) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null,"Opcion Invalida");
              }
            }

        });
        panel2.add(b2); 

        // boton de accion retiro

        b4 = new JButton("Depositar saldo"); 
        b4.setBounds(100,200,120,20); 
        b4.setVisible(false);
        b4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              try {
                String csaldo = c.getText(); 
                int num = Integer.parseInt(csaldo); 
                String creti = c3.getText(); 
                int num2 = Integer.parseInt(creti); 
                int resultado = num -num2; 
                String resultado2 = String.valueOf(resultado); 
                c.setText(resultado2);
                c3.setText("");
                JOptionPane.showMessageDialog(null,"Ticket \nSaldo anterior : $ " + csaldo + "\nSaldo actual : $ " + resultado2 + "\nRetiro : $ " + creti + "\nGracias ");
              } catch (Exception e12) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null,"Opcion Invalida");
              }
            }

        });
        panel2.add(b4); 






    }

    
}
