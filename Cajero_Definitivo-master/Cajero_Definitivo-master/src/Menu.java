import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.StyledEditorKit.StyledTextAction;

public class Menu extends JFrame {

    private int ancho = 600;
    private int largo = 600;
    private int anchop = 400;
    private int largop = 300;
    private JPanel panel;
    private JPanel panel2;
    private JTextField campo;
    private JTextField campo2;
    private JTextField campo3; 
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
    

    public Menu() {

        this.setSize(ancho, largo);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        paneles();
        panelesextra();

    }

    public void paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel).setBackground(Color.CYAN);
        ;
        panelesextra();
        etiquetas();
        botones();
        campos();

    }

    public void panelesextra() {
        panel2 = new JPanel(); // retiros
        panel2.setLayout(null);
        panel2.setBounds(165, 180, anchop, largop);
        panel.add(panel2);
        panel2.setBackground(Color.cyan);
        panel2.setVisible(true);
        etiquetas();
        campos();

    }

    public void etiquetas() {

        e1 = new JLabel();
        e1.setBounds(250, 70, 120, 20);
        e1.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(e1);

        e2 = new JLabel("Saldo"); // etiqueta del saldo
        e2.setBounds(50, 40, 100, 20);
        e2.setVisible(true);
        panel2.add(e2);

        e3 = new JLabel();
        e3.setBounds(50, 70, 120, 20);
        e3.setVisible(false);
        panel2.add(e3);

    }

    public void campos() {

        campo = new JTextField();
        campo.setBounds(180, 70, 120, 20);// estas se comparten entre el retiro y deposito
        campo.setVisible(false);
        panel2.add(campo);

        campo3 = new JTextField("20"); // este es el del saldo principal 
        campo3.setBounds(180,40,120,20); 
        campo3.setEditable(false);
        panel2.add(campo3); 

    }

    /**
     * 
     */
    public void botones() {
        b = new JButton();
        b.setBounds(20, 150, 140, 50);
        b.setText("Retiro");
        b.setIcon(new ImageIcon("retiro.png"));
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

        b3 = new JButton();// este boton aparece el panel  de deposito 
        b3.setBounds(20, 250, 140, 50);
        b3.setText("Deposito");
        b3.setIcon(new ImageIcon("ingresar.png"));
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

        b4 = new JButton();// boton de salida 
        b4.setBounds(20, 350, 140, 50);
        b4.setText("Salir");
        b4.setIcon(new ImageIcon("adios.png"));
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

        b5 = new JButton();// este boton aparece la ventana de salida 
        b5.setBounds(100, 200, 120, 50);
        b5.setText("Retirar");
        b5.setVisible(false);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        panel2.add(b5);

        b6 = new JButton();// estos dos ultimos botones ya generan la accion
        b6.setBounds(100, 200, 120, 50);
        b6.setText("Depositar");
        b6.setVisible(false);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String csaldo = campo3.getText(); 
                int num = Integer.parseInt(csaldo); 
                String cdeposito = campo.getText(); 
                int num2 = Integer.parseInt(cdeposito); 
                int resultado = num + num2; 
                String resultado2 = String.valueOf(resultado); 
                campo3.setText(resultado2);
                campo.setText("");
               
            }
            
        });
        panel2.add(b6);

        b7 = new JButton();// boton que genera la accion 
        b7.setBounds(100, 200, 120, 20);
        b7.setText("Deposito");
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
            
        });
        b7.setVisible(false);
        panel2.add(b7);

    }

    /*
     * AQUI FALTA QUE LOS BOTONES HAGAN ACCIONES ES LO MAS IMPORTANTE
     * solo falta el de deposito un boton y que los botones manden la informacion al
     * seericodr
     */

}
