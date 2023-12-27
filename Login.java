
package bank.managementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    //String formno;
    Login(){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image  i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(70, 10, 100, 100);
        add(l1);
        
        
        
        JLabel l2 = new JLabel("WELCOME TO ATM");
        l2.setFont(new Font("Osword",Font.BOLD,20));
        l2.setBounds(200, 40, 200, 40);
        add(l2);
        
        JLabel l3 = new JLabel("CARD NUMBER :");
        l3.setFont(new Font("Osword",Font.BOLD,20));
        l3.setBounds(150, 150, 200, 40);
        add(l3);
        t1 = new JTextField();
        t1.setBounds(320, 150, 200, 40);
        t1.setFont(new Font("Arial",Font.BOLD,20));
        add(t1);
        
        JLabel l4 = new JLabel("PIN :");
        l4.setFont(new Font("Osword",Font.BOLD,20));
        l4.setBounds(150, 200, 200, 40);
        add(l4);
        t2 = new JPasswordField();
        t2.setBounds(320, 200, 200, 40);
        t2.setFont(new Font("Osward",Font.BOLD,30));
        add(t2);
        
        b3 = new JButton("Sign-In");
        b3.setBounds(200, 290, 150, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
        
        b2 = new JButton("Clear");
        b2.setBounds(380, 290, 170, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b1 = new JButton("SIGN-UP");
        b1.setBounds(250, 330, 260, 30);    
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setTitle("ATM");
        setSize(800,450);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        
            
        if(ae.getSource()==b1){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
        else if(ae.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }
        else if(ae.getSource()==b3){
            Conn conn = new Conn();
            String cardnumber = t1.getText();
            String pinnumber = t2.getText();
            String query = "select * from login where cardnumber ='"+cardnumber+"'and pin = '"+pinnumber+"' ";
            try
            {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Cardnumber or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }
    
        }
    
    public static void main(String args[]) {
        new Login();
    }
}
