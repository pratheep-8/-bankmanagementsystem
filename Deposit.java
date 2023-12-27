
package bank.managementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Deposit extends JFrame implements ActionListener {
    JButton depo,back;
    JTextField t1;
    String pinnum;
    Deposit(String pinnumber){
          this.pinnum = pinnumber;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter The Amount You Want To Deposit");
        text.setBounds(180, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.BOLD,16));
        image.add(text);
        
        t1 = new JTextField();
        t1.setFont(new Font("Railway",Font.BOLD,16));   
        t1.setBounds(170, 350, 320, 25);
        image.add(t1);
        
        depo = new JButton("Deposit");
        depo.setBounds(355, 485, 150, 30);
        image.add(depo);
        depo.addActionListener(this);
        
        
        back = new JButton("Back");
        back.setBounds(170, 485, 150, 30);
        image.add(back);
        back.addActionListener(this);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==depo){
            String number = t1.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Amount");
                
            }
            else
            {
                try{
                Conn conn = new Conn();
                String query = "insert into bank values('"+pinnum+"','"+date+"','"+"Deposit"+"','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + number +" " +"Deposited Successfully" );
                setVisible(false);
                new Transactions(pinnum).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
                }
            
            }
                
                
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnum).setVisible(true);
        }
    }

    
    public static void main(String args[]) {
       new Deposit("");
    }
}
