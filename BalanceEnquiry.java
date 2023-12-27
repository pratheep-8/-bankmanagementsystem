
package bank.managementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BalanceEnquiry extends JFrame implements ActionListener  {
    JButton back;
    String pinnum;
    BalanceEnquiry(String pinnumber){
        this.pinnum = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(355,485,150,30);   
        image.add(back);
        back.addActionListener(this);
         
        
        Conn c = new Conn();
        int balance = 0;
        try{
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnum+"'");
            
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            
            }
        }catch(Exception e){
                    System.out.println(e);
             }
        JLabel text = new JLabel("Your Current Balance Is Rs " +balance);
        text.setBounds(165, 280, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.BOLD,18));
        image.add(text);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(true);
        new Transactions(pinnum).setVisible(true);
    }

    
    public static void main(String args[]) {
        new BalanceEnquiry("");
    }
}
