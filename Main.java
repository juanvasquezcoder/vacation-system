import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
  private JMenuBar bar;
  private JMenu menuOptions, menuCalculate, menuAbout, menuBackgroundColor;
  private JMenuItem myCalculate, myRed, myBlack,  myPurple, myExit, myNew, elCreador;
  private JLabel logo, welcome, text, name, lastnamep, lastnamem, departament, old, vacations, copyright;
  private JTextField tfname, tflastnamep, tflastnamem;
  private JComboBox cdepartament, cold;
  private JTextArea result;
  private JScrollPane scroll;
  String Wname = "";
  public Main(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Vacations");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Welcome WWelcome = new Welcome();
    Wname = WWelcome.text;
    
    bar = new JMenuBar();
    bar.setBackground(new Color(255, 0, 0));
    setJMenuBar(bar);
    
    menuOptions = new JMenu("Options");
    menuOptions.setBackground(new Color(255, 1, 0));
    menuOptions.setFont(new Font("Andale Mono", 2, 14));
    menuOptions.setForeground(new Color(255, 255, 255));
    bar.add(menuOptions);
    
    menuCalculate = new JMenu("Calculate");
    menuCalculate.setBackground(new Color(255, 1, 0));
    menuCalculate.setFont(new Font("Andale Mono", 2, 14));
    menuCalculate.setForeground(new Color(255, 255, 255));
    bar.add(menuCalculate);
    
    menuAbout = new JMenu("About");
    menuAbout.setBackground(new Color(255, 1, 0));
    menuAbout.setFont(new Font("Andale Mono", 2, 14));
    menuAbout.setForeground(new Color(255, 255, 255));
    bar.add(menuAbout);

    menuBackgroundColor = new JMenu("Background");
    menuBackgroundColor.setFont(new Font("Andale Mono", 2, 14));
    menuBackgroundColor.setForeground(new Color(255, 0, 0));
    menuOptions.add(menuBackgroundColor);

    myRed = new JMenuItem("Red");
    myRed.setFont(new Font("Andale Mono", 2, 14));
    myRed.setForeground(new Color(255, 0, 0));
    menuBackgroundColor.add(myRed);
    myRed.addActionListener(this);

    myBlack = new JMenuItem("Black");
    myBlack.setFont(new Font("Andale Mono", 2, 14));
    myBlack.setForeground(new Color(255, 0, 0));
    menuBackgroundColor.add(myBlack);
    myBlack.addActionListener(this);
    
    myPurple = new JMenuItem(" Purple");
    myPurple.setFont(new Font("Andale Mono", 2, 14));
    myPurple.setForeground(new Color(255, 0, 0));
    menuBackgroundColor.add(myPurple);
    myPurple.addActionListener(this);

    myNew = new JMenuItem("New");
    myNew.setFont(new Font("Andale Mono", 2, 14));
    myNew.setForeground(new Color(255, 0, 0));
    menuOptions.add(myNew);
    myNew.addActionListener(this);

    myExit = new JMenuItem("Exit");
    myExit.setFont(new Font("Andale Mono", 2, 14));
    myExit.setForeground(new Color(255, 0, 0));
    menuOptions.add(myExit);
    myExit.addActionListener(this);

    myCalculate = new JMenuItem("Vacations");
    myCalculate.setFont(new Font("Andale Mono", 2, 14));
    myCalculate.setForeground(new Color(255, 0, 0));
    menuCalculate.add(myCalculate);
    myCalculate.addActionListener(this);

    elCreador = new JMenuItem("About Me");
    elCreador.setFont(new Font("Andale Mono", 2, 14));
    elCreador.setForeground(new Color(255, 0, 0));
    menuAbout.add(elCreador);
    elCreador.addActionListener(this);
    
    ImageIcon image = new ImageIcon("images/logo-coca.png");
    logo = new JLabel(image);
    logo.setBounds(5, 5, 250, 100);
    add(logo);

    welcome = new JLabel("Welcome " + Wname);
    welcome.setBounds(260, 40, 380, 50);
    welcome.setFont(new Font("Andale Mono", 1, 35));
    welcome.setForeground(new Color(255, 255, 255));
    add(welcome);

    text = new JLabel("Datos del trabajador para el cálculo de vacaciones");
    text.setBounds(35, 120, 620, 50);
    text.setFont(new Font("Andale Mono", 0, 26));
    text.setForeground(new Color(255, 255, 255));
    add(text);

    name = new JLabel("Name");
    name.setBounds(20, 180, 200, 30);
    name.setFont(new Font("Andale Mono", 1, 17));
    name.setForeground(new Color(255, 255, 255));
    add(name);

    tfname =  new JTextField();
    tfname.setBounds(20, 210, 200, 25);
    tfname.setBackground(new java.awt.Color(224, 224, 224));
    tfname.setFont(new Font("Andale Mono", 1, 15));
    tfname.setForeground(new java.awt.Color(255, 0, 0));
    add(tfname);

    lastnamep = new JLabel("First Lastname");
    lastnamep.setBounds(20, 250, 200, 30);
    lastnamep.setFont(new Font("Andale Mono", 1, 17));
    lastnamep.setForeground(new Color(255, 255, 255));
    add(lastnamep);

    tflastnamep = new JTextField();
    tflastnamep.setBounds(20, 280, 200, 25);
    tflastnamep.setBackground(new java.awt.Color(224, 224, 224));
    tflastnamep.setFont(new Font("Andale Mono", 1, 15));
    tflastnamep.setForeground(new java.awt.Color(255, 0, 0));
    add(tflastnamep);

    lastnamem = new JLabel("Secound Lastname");
    lastnamem.setBounds(20, 315, 200, 30);
    lastnamem.setFont(new Font("Andale Mono", 1, 17));
    lastnamem.setForeground(new Color(255, 255, 255));
    add(lastnamem);

    tflastnamem = new JTextField();
    tflastnamem.setBounds(20, 345, 200, 25);
    tflastnamem.setBackground(new java.awt.Color(224, 224, 224));
    tflastnamem.setFont(new Font("Andale Mono", 1, 15));
    tflastnamem.setForeground(new java.awt.Color(255, 0, 0));
    add(tflastnamem);

    departament = new JLabel("Departament");
    departament.setBounds(350, 180, 200, 30);
    departament.setFont(new Font("Andale Mono", 1, 17));
    departament.setForeground(new Color(255, 255, 255));
    add(departament);

    cdepartament = new JComboBox();
    cdepartament.setBounds(350, 210, 200, 25);
    cdepartament.setBackground(new java.awt.Color(224, 224, 224));
    cdepartament.setFont(new Font("Andale Mono", 1, 15));
    cdepartament.setForeground(new java.awt.Color(255, 0, 0));
    add(cdepartament);
    cdepartament.addItem("");
    cdepartament.addItem("Atención al Cliente");
    cdepartament.addItem("Departamento de Logística");
    cdepartament.addItem("Departamento de Gerencia");

    old = new JLabel("Old");
    old.setBounds(350, 250, 200, 30);
    old.setFont(new Font("Andale Mono", 1, 17));
    old.setForeground(new Color(255, 255, 255));
    add(old);

    cold = new JComboBox();
    cold.setBounds(350, 280, 200, 25);
    cold.setBackground(new java.awt.Color(224, 224, 224));
    cold.setFont(new Font("Andale Mono", 1, 15));
    cold.setForeground(new java.awt.Color(255, 0, 0));
    add(cold);
    cold.addItem("");
    cold.addItem("1 año de servicio");
    cold.addItem("2 a 6 años de servicio");
    cold.addItem("7 años o mas de servicio");

    vacations = new JLabel("Vacations");
    vacations.setBounds(350, 315, 200, 30);
    vacations.setFont(new Font("Andale Mono", 1, 17));
    vacations.setForeground(new Color(255, 255, 255));
    add(vacations);
    
    result = new JTextArea();
    result.setEditable(false);
    result.setBackground(new Color(224, 224, 224));
    result.setFont(new Font("Andale Mono", 1, 11));
    result.setForeground(new Color(255, 0, 0));
    result.setText("\n       Aquí aparece el resultado del cálculo de las" + "\n       vacaciones.");
    scroll = new JScrollPane(result);
    scroll.setBounds(350, 345, 300, 100);
    add(scroll);

    copyright = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    copyright.setBounds(130, 500, 500, 30);
    copyright.setFont(new Font("Andale Mono", 2, 14));
    copyright.setForeground(new Color(255, 255, 255));
    add(copyright);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == myCalculate){
      String NT = tfname.getText();
      String LP = tflastnamep.getText();
      String LM = tflastnamem.getText();
      String D = cdepartament.getSelectedItem().toString();
      String A = cold.getSelectedItem().toString();
      if(NT.equals("") || LP.equals("") || LM.equals("") || D.equals("") || A.equals("")){
        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
      } else {
        if(D.equals("Atención al Cliente")){
          if(A.equals("1 año de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 6 días de vacaciones.");
          }
          if(A.equals("2 a 6 años de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 14 días de vacaciones.");
          }
          if(A.equals("7 años o mas de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 20 días de vacaciones.");
          }
        }
        if(D.equals("Departamento de Logística")){
          if(A.equals("1 año de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 6 días de vacaciones.");
          }
          if(A.equals("2 a 6 años de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 14 días de vacaciones.");
          }
          if(A.equals("7 años o mas de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 20 días de vacaciones.");
          }
        }
        if(D.equals("Departamento de Gerencia")){
          if(A.equals("1 año de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 6 días de vacaciones.");
          }
          if(A.equals("2 a 6 años de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 14 días de vacaciones.");
          }
          if(A.equals("7 años o mas de servicio")){
            result.setText("\n El trabajador " + NT + " " + LP + " " + LM + " quien labora en\n" + D +
                           " con " + A + "\n recibe 20 días de vacaciones.");
          }
        }
      }
    }
    if(e.getSource() == myRed){
      getContentPane().setBackground(new Color(255, 0, 0));
      bar.setBackground(new Color(255, 0, 0));
    }
    if(e.getSource() == myBlack){
      getContentPane().setBackground(new Color(0, 0, 0));
      bar.setBackground(new Color(0, 0, 0));
    }
    if(e.getSource() == myPurple){
      getContentPane().setBackground(new Color(51, 0, 51));
      bar.setBackground(new Color(51, 0, 51));
    }
    if(e.getSource() == myExit){
      Welcome welcome = new Welcome();
      welcome.setBounds(0, 0, 380, 460);
      welcome.setVisible(true);
      welcome.setResizable(false);
      welcome.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if(e.getSource() == myNew){
      tfname.setText("");
      tflastnamep.setText("");
      tflastnamem.setText("");
      cdepartament.setSelectedIndex(0);
      cold.setSelectedIndex(0);
      result.setText("\n       Aquí aparece el resultado del cálculo de las" + "\n       vacaciones."); 
    }
    if(e.getSource() == elCreador){
      JOptionPane.showMessageDialog(null, "Desarrollado por Juan Vasquez\n Instagram: @juanvasquezcoder");
    }
  }
  public static void main(String args[]){
    Main main = new Main();
    main.setBounds(0, 0, 690, 600);
    main.setVisible(true);
    main.setResizable(true);
    main.setLocationRelativeTo(null);
  }
}
