import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.StyledEditorKit.StyledTextAction;

public class Menu extends JFrame{

    private int ancho = 600; 
    private int largo = 600; 
    private int anchop = 400; 
    private int largop = 300; 
    private JPanel panel; 
    private JPanel panel2;
    private JTextField campo; 
    private JTextField campo2; 
    private JLabel e1; 
    private JLabel e2; 
    private JLabel e3;
    private JLabel e4; 
    private JButton b; 
    private JButton b2; 
    private JButton b3; 
    private JButton b4; 
    private JButton b5; 
    private JButton b6; 
    private JButton b7; 
    private JButton b8; 

    
    public Menu(){

        this.setSize(ancho,largo);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        paneles(); 
        panelesextra();

    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 
        panelesextra(); 
        etiquetas(); 
        botones(); 
        campos();
        
    }
    public void panelesextra(){
        panel2 = new JPanel(); // retiros
        panel2.setLayout(null);
        panel2.setBounds(155, 180, anchop, largop);
        panel.add(panel2); 
        panel2.setVisible(true);
        etiquetas();
        campos(); 

       
    }
 
    public void etiquetas(){

        e1 = new JLabel(); 
        e1.setBounds(250, 70, 120, 20);
        e1.setFont(new Font("arial",Font.BOLD,22)); 
        panel.add(e1); 

        e2 = new JLabel("Saldo"); // etiqueta del saldo 
        e2.setBounds(50, 40, 100, 20);
        e2.setVisible(true);
        panel2.add(e2); 

        e3 = new JLabel(); 
        e3.setBounds(50,70,120,20);
        e3.setVisible(false);
        panel2.add(e3); 


    }

    public void campos(){
        campo = new JTextField(); 
        campo.setBounds(180,70,120,20);
        campo.setVisible(false);
        panel2.add(campo); 
        
    }

    public void botones(){
        b = new JButton(); 
        b.setBounds(20, 200, 120, 20);
        b.setText("Retiro");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             e1.setText("Retiros");   
             setTitle("Retiros");  
             e3.setVisible(true);
             e3.setText("Retiro : ");
             campo.setVisible(true);
             b5.setVisible(true);
             b6.setVisible(true);
       
            }
            
        });
        panel.add(b); 

        b3 = new JButton(); 
        b3.setBounds(20, 250, 120, 20);
        b3.setText("Deposito");
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             b5.setVisible(false);
             e1.setText("Depositos");  
             setTitle("Deposito"); 
             e3.setVisible(true);
             e3.setText("Deposito : ");
             b7.setVisible(true);
             campo.setVisible(true);

           
            }
            
        });
        panel.add(b3);

        b4 = new JButton(); 
        b4.setBounds(20, 300, 120, 20);
        b4.setText("Salir");
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             setTitle("salir"); 
             Salir obj = new Salir(); 
             obj.setVisible(true);
             setVisible(false);
     
            }
            
        });
        panel.add(b4);

        b5 = new JButton(); 
        b5.setBounds(100, 200, 120, 20);
        b5.setText("Retirar");
        b5.setVisible(false);
        b5.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
            
        });
        panel2.add(b5); 

        b6 = new JButton(); 
        b6.setBounds(100, 200, 120, 20);
        b6.setText("Retirar");
        b6.setVisible(false);
        panel2.add(b6); 

        b7 = new JButton(); 
        b7.setBounds(100, 200, 120, 20);
        b7.setText("Deposito");
        b7.setVisible(false);
        panel2.add(b7); 



    }

    /* AQUI FALTA QUE LOS BOTONES HAGAN ACCIONES ES LO MAS IMPORTANTE 
     * solo falta el de deposito un boton y que los botones manden la informacion al seericodr 
     */



    
}
