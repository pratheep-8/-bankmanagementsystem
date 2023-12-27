
package bank.managementsystem;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener {
    JTextField t1;
    JPasswordField t2;
    JButton change,back;
    String pinnum;
    Pinchange(String pinnumber){
        this.pinnum =pinnumber ;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Change Your Pin");
        text.setBounds(250, 280, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.BOLD,18));
        image.add(text);
        
        
        JLabel pintext = new JLabel("New Pin");
        pintext.setBounds(165, 320, 180, 20);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Railway",Font.BOLD,18));
        image.add(pintext);
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Railway",Font.BOLD,25));
        t1.setBounds(330, 320, 180, 25);
        image.add(t1);
        
        JLabel repintext = new JLabel("Re-Enter New Pin");
        repintext.setBounds(165, 380, 180, 20);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Railway",Font.BOLD,18));
        image.add(repintext);
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Railway",Font.BOLD,25));
        t2.setBounds(330, 380, 180, 25);
        image.add(t2);
        
        change = new JButton("Change");
        change.setBounds(355,485,150,30);   
        image.add(change);
        change.addActionListener(this);
        
        
        back = new JButton("Back");
        back.setBounds(165,485,150,30);   
        image.add(back);
        back.addActionListener(this);
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
            try{
                String npin = t1.getText();
                String rpin = t2.getText();
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Pin Does Not Match");
                    return;
                }
                
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Pin");
                    return;
                }
                
                
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter New Pin");
                    return;
                    
                }
                Conn c = new Conn();
                String query1 = "update bank set pin = '"+rpin+"'where pin = '"+pinnum+"' ";
                String query2 = "update login set pin = '"+rpin+"'where pin = '"+pinnum+"' ";
                String query3 = "update signupthree set pin = '"+rpin+"'where pin = '"+pinnum+"' ";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
                setVisible(false);
                new Transactions(pinnum).setVisible(true);
        
            }catch(Exception e){
            System.out.println(e);
        }
        }
        else{
            setVisible(false);
            new Transactions(pinnum).setVisible(true);
        }
            
       
    }

    
    public static void main(String args[]) {
        new Pinchange("").setVisible(true);
        
    }
}
