import javax.swing.JFrame;
import javax.swing.*; 

public class Servidor extends JFrame implements Runnable{

    private int ancho = 400; 
    private int largo = 400; 
    private JPanel panel; 
    private JLabel e ; 
    private JButton b ; 
    private JLabel e2; 

    @Override 
    public void run(){

    }
    public Servidor(){

        this.setSize(ancho,largo);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Servidor");
        this.setLocationRelativeTo(null);
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
        
    }
    public void botones(){

    }

    /* aqui falta las crear el servidor agregar etiquetas y botones y que haga las notas  */

}
