import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Preguntatres extends JFrame implements ActionListener {

  private JLabel texto1, texto2;
  JButton but1, but2, but3;

    public Preguntatres() {

      JFrame jf = new JFrame("Preguntatres");//creacion de ventana con el titulo
      setLayout(new FlowLayout());//Configurar como se dispondra el espacio del jframe
      Dimension d = new Dimension();

      texto1 = new JLabel("Preguntatres");
      texto1.setBounds(150,10,200,100);
      texto1.setFont(new java.awt.Font("Jokerman", 0, 30));
      add(texto1);

      setLayout(null);
      but1 = new JButton("Iniciar Juego");
      but2 = new JButton("Preguntas");
      but3 = new JButton("Configuracion");
      but1.setBounds(200,200,100,25);
      but2.setBounds(200,300,100,25);
      but3.setBounds(200,400,100,25);
      but1.setMargin(new Insets(3, 5, 3, 5));
      but2.setMargin(new Insets(1, 1, 1, 1));
      but3.setMargin(new Insets(6, 7, 6, 7));
      add(but1);
      add(but2);
      add(but3);
      but1.addActionListener(this);
      but2.addActionListener(this);
      but3.addActionListener(this);

    }
    

    public static void main(String[] args) {
        Preguntatres ex = new Preguntatres();
        ex.setTitle("Preguntatres");
        ex.setSize(500, 500);
        ex.setVisible(true);
        ex.setResizable(false);
        ex.setLocationRelativeTo(null);
        ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
