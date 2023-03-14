import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener{

  private JTextField name;
  private JLabel lname, scv, iname, copyright;
  private JButton login;
  public static String text = "";
  
  public Welcome(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    ImageIcon image = new ImageIcon("images/logo-coca.png");

    lname = new JLabel(image);
    lname.setBounds(35,15,300,150);
    add(lname);
    
    scv = new JLabel("Sistema de control vacacional");
    scv.setBounds(55,135,300,30);
    scv.setFont(new Font("Andale Mono", 3, 18));
    scv.setForeground(new Color(255,255,255));
    add(scv);

    iname = new JLabel("Ingrese su nombre:");
    iname.setBounds(80, 212, 200, 30);
    iname.setFont(new Font("Andale Mono", 3, 12));
    iname.setForeground(new Color(255 ,255 ,255));
    add(iname);

    copyright = new JLabel("©2017 The Coca-Colar Company");
    copyright.setBounds(85, 375, 300, 30);
    copyright.setFont(new Font("Andale Mono", 1, 12));
    copyright.setForeground(new Color(255 ,255 ,255));
    add(copyright);
    
    name = new JTextField();
    name.setBounds(80, 245, 200, 30);
    name.setBackground(new Color(224, 224, 224));
    name.setFont(new Font("Andale Mono", 1, 14));
    name.setForeground(new Color(255, 0, 0));
    add(name);
    
    login = new JButton("Ingresar");
    login.setBounds(130, 300, 100, 40);
    login.setBackground(new Color(224, 224, 225));
    login.setFont(new Font("Andale Mono", 3, 13));
    login.setForeground(new Color(255, 0, 0));
    login.addActionListener(this);
    add(login);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == login){
      text = name.getText().trim();
      if(text.equals("")){
        JOptionPane.showMessageDialog(null, "Desbes ingresar tu nombre.");
      } else {
        License tac = new License();
        tac.setBounds(0, 0, 610, 370);
        tac.setVisible(true);
        tac.setResizable(false);
        tac.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }
  public static void main(String args[]){
    Welcome welcome = new Welcome();
    welcome.setBounds(0, 0, 380, 460);
    welcome.setVisible(true);
    welcome.setResizable(false);
    welcome.setLocationRelativeTo(null);
  }
}
