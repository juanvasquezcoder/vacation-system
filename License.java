import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class License extends JFrame implements ActionListener,ChangeListener{
  private JLabel terminos, logo;
  private JTextArea textarea;
  private JScrollPane scroll;
  private JCheckBox igree;
  private JButton next, dont;
  String name = ""; 	
  public License(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Welcome WWelcome = new Welcome();
    name = WWelcome.text;

    terminos = new JLabel("TÉRMINOS Y CONDICIONES");
    terminos.setBounds(215, 5, 200, 30);
    terminos.setFont(new Font("Andale Mono", 1, 14));
    terminos.setForeground(new Color(0, 0, 0));
    add(terminos);
    
    textarea = new JTextArea();
    textarea.setEditable(false);
    textarea.setFont(new Font("Andale Mono", 0, 9));
    textarea.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                     "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                     "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                     "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                     "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                     "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                     "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                     "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                     "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                     "\n          http://www.youtube.com/ernestoperezm");
    scroll = new JScrollPane(textarea);
    scroll.setBounds(10, 40, 575, 200);
    add(scroll);
    
    igree = new JCheckBox("Yo " + name + " Acepto");
    igree.setBounds(10, 250, 300, 30);
    igree.addChangeListener(this);
    add(igree);

    next = new JButton("I gree");
    next.setBounds(10, 290, 100, 30);
    next.addActionListener(this);
    next.setEnabled(false);
    add(next);
  
    dont = new JButton("Don't gree");
    dont.setBounds(120, 290, 100, 30);
    dont.addActionListener(this);
    dont.setEnabled(true);
    add(dont);

    ImageIcon image = new ImageIcon("images/coca-cola.png");
    logo = new JLabel(image);
    logo.setBounds(315, 135, 300, 300);
    add(logo);
  }
  public void stateChanged(ChangeEvent e){
     if(igree.isSelected() == true){
       next.setEnabled(true);
       dont.setEnabled(false);
     } else {
       next.setEnabled(false);
       dont.setEnabled(true);
     }
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == next){
      Main main = new Main();
      main.setBounds(0, 0, 690, 600);
      main.setVisible(true);
      main.setResizable(true);
      main.setLocationRelativeTo(null);
      this.setVisible(false);
    } else if(e.getSource() == dont){
      Welcome welcome = new Welcome();
      welcome.setBounds(0, 0, 380, 460);
      welcome.setVisible(true);
      welcome.setResizable(false);
      welcome.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }
  public static void main(String args[]){
    License tac = new License();
    tac.setBounds(0, 0, 610, 370);
    tac.setVisible(true);
    tac.setResizable(false);
    tac.setLocationRelativeTo(null);
  }
}
