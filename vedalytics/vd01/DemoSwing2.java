
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class DemoSwing2 
{
  
  

  public DemoSwing2() {
    
    JFrame jf = new JFrame("Login Form");
    jf.getContentPane().setBackground(Color.cyan);
  
    Font f = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    Font f1 = new Font(Font.MONOSPACED, Font.PLAIN, 20);
    JLabel l1 = new JLabel("Login Form");
    l1.setBounds(120, 30, 200, 40);
    l1.setFont(f);
    l1.setForeground(Color.RED);
    
    JLabel laberusername = new JLabel("User Name: ");
    laberusername.setBounds(50, 100, 150, 30);
    laberusername.setFont(f1);
    laberusername.setForeground(Color.BLUE);
    
    JLabel laberPassword = new JLabel("Password : ");
    laberPassword.setBounds(50, 150, 150, 30);
    laberPassword.setFont(f1);
    laberPassword.setForeground(Color.BLUE);
    
    JTextField tf = new JTextField();
    tf.setBounds(180, 105, 150, 30);
    tf.setFont(f1);
    tf.setForeground(Color.BLUE);
    
    JPasswordField passwordField = new JPasswordField();
    passwordField.setBounds(180, 150, 150, 30);
    passwordField.setFont(f1);
    passwordField.setForeground(Color.BLUE);
    
    JButton jb = new JButton("Login");
    jb.setBounds(150, 200, 100, 30);
    jb.setFont(f1);
    jb.setForeground(Color.BLUE);
    jb.setBackground(Color.RED);
    
    
    jf.add(l1);jf.add(laberusername);jf.add(laberPassword);
    jf.add(tf);jf.add(passwordField);jf.add(jb);
    jf.setSize(400, 400);
    jf.setLayout(null);
    jf.setVisible(true);
  }

  public static void main(String[] args) 
  {
    
    new DemoSwing2();

  }

}

