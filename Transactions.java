
package bank.managementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener {
    JButton dep,with,fc,be,ms,pc,exit;
    String pinnum;
    Transactions(String pinnumber){
       this.pinnum =  pinnumber ;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please Seleect Your Transcation");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.BOLD,16));
        image.add(text);
        
        dep = new JButton("Deposit");
        dep.setBounds(170, 415, 150, 30);
        image.add(dep);
        dep.addActionListener(this);
        
        
        with = new JButton("Cash Withdrawl");
        with.setBounds(355, 415, 150, 30);
        image.add(with);
        with.addActionListener(this);
        
        
        
        
        fc = new JButton("Fast Cash");
        fc.setBounds(170, 450, 150, 30);
        image.add(fc);
        fc.addActionListener(this);
        
        
        ms = new JButton("Minimum Statement");
        ms.setBounds(355, 450, 150, 30);
        image.add(ms);
        ms.addActionListener(this);
        
        pc = new JButton("Pin Change");
        pc.setBounds(170, 485, 150, 30);
        image.add(pc);
        pc.addActionListener(this);
        
        be = new JButton("Balance Enquiry");
        be.setBounds(355, 485, 150, 30);
        image.add(be);
        be.addActionListener(this);
        
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        image.add(exit);
        exit.addActionListener(this);
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(exit)){
            System.exit(0);
        }
        else if(ae.getSource().equals(dep)){
            setVisible(false);
            new Deposit(pinnum).setVisible(true);
            
            
        }
        else if(ae.getSource().equals(with)){
            setVisible(false);
            new Withdrawl(pinnum).setVisible(true);
        }
        
        else if(ae.getSource().equals(fc)){
            setVisible(false);
            new Fastcash(pinnum).setVisible(true);
        }
        else if(ae.getSource().equals(pc)){
            setVisible(false);
            new Pinchange(pinnum).setVisible(true);
        }
        else if(ae.getSource().equals(be)){
            setVisible(false);
            new BalanceEnquiry(pinnum).setVisible(true);
        }
        else if(ae.getSource().equals(ms)){
            setVisible(false);
            new MiniStatement(pinnum).setVisible(true);
        }
            
    }

    
    public static void main(String args[]) {
        new Transactions("");
    }

    
    
}
