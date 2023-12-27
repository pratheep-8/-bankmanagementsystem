
package bank.managementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit ,cancel;
    String formno;
    SignUpThree(String formno){
        this.formno = formno;
        JLabel l1 =  new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Railway",Font.BOLD,30));
        l1.setBounds(280, 40, 600, 40);
        add(l1);
        
        JLabel type =  new JLabel("Account Type");
        type.setFont(new Font("Railway",Font.BOLD,20));
        type.setBounds(100, 140, 250, 30);
        add(type);
        
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Railway",Font.BOLD,15));
        r1.setBounds(100, 180, 200, 25);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Railway",Font.BOLD,15));
        r2.setBounds(310, 185, 500, 15);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Railway",Font.BOLD,15));
        r3.setBounds(100, 220, 200, 15);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Reccuring Deposit Account");
        r4.setFont(new Font("Railway",Font.BOLD,15));
        r4.setBounds(310, 220, 500, 15);
        r4.setBackground(Color.WHITE);
        add(r4);
        ButtonGroup grp4 = new ButtonGroup();
        grp4.add(r1);
        grp4.add(r2);
        grp4.add(r3);
        grp4.add(r4);
        
        JLabel cardno =  new JLabel("Card Number");
        cardno.setFont(new Font("Railway",Font.BOLD,20));
        cardno.setBounds(100, 250, 250, 30);
        add(cardno);
        
        
        JLabel number =  new JLabel("XXXX-XXXX-XXXX-7896");
        number.setFont(new Font("Railway",Font.BOLD,20));
        number.setBounds(340, 255, 250, 30);
        add(number);
        
        JLabel det =  new JLabel("Your 16 Digit Card Number");
        det.setFont(new Font("Railway",Font.BOLD,15));
        det.setBounds(340, 300, 250, 30);
        add(det);
        
        
        
        JLabel pin1 =  new JLabel("Pin Number");
        pin1.setFont(new Font("Railway",Font.BOLD,20));
        pin1.setBounds(100, 350, 250, 30);
        add(pin1);
        
        
        JLabel pnumber =  new JLabel("XXXX");
        pnumber.setFont(new Font("Railway",Font.BOLD,20));
        pnumber.setBounds(340, 350, 250, 30);
        add(pnumber);
        
        JLabel pdet =  new JLabel("Your 4 Digit Pin Number");
        pdet.setFont(new Font("Railway",Font.BOLD,15));
        pdet.setBounds(340, 400, 250, 30);
        add(pdet);
        
        
        JLabel service =  new JLabel("Services Required");
        service.setFont(new Font("Railway",Font.BOLD,20));
        service.setBounds(100, 450, 300, 20);
        add(service);
        
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Railway",Font.BOLD,18));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100, 500, 200, 20);
        add(c1);
        
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Railway",Font.BOLD,18));
        c2.setBackground(Color.WHITE);
        c2.setBounds(300, 500, 200, 20);
        add(c2);
        
        
        c3 = new JCheckBox("Mobile Banking ");
        c3.setFont(new Font("Railway",Font.BOLD,18));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100, 550, 200, 20);
        add(c3);
        
        
        c4 = new JCheckBox("Email and SMS Alerts");
        c4.setFont(new Font("Railway",Font.BOLD,18));
        c4.setBackground(Color.WHITE);
        c4.setBounds(300, 550, 300, 20);
        add(c4);
        
        
        
        c5 = new JCheckBox("Cheque BOOK");
        c5.setFont(new Font("Railway",Font.BOLD,18));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100, 580, 200, 20);
        add(c5);
        
        
        
        c6 = new JCheckBox("E-Statement ");
        c6.setFont(new Font("Railway",Font.BOLD,18));
        c6.setBackground(Color.WHITE);
        c6.setBounds(300, 580, 200, 20);
        add(c6);
        
        
        
        
        c7 = new JCheckBox("I Hereby Declare That The Above Mentioned Datas Are Of My Knowledge");
        c7.setFont(new Font("Railway",Font.BOLD,18));
        c7.setBackground(Color.WHITE);
        c7.setBounds(50, 620, 1000, 20);
        add(c7);
        
        
        submit = new JButton("Submit");
        submit.setBounds(110, 650, 100, 20);
        submit.setFont(new Font("Railway",Font.BOLD,15));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        add(submit);
        submit.addActionListener(this);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(300, 650, 100, 20);
        cancel.setFont(new Font("Railway",Font.BOLD,15));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);
        cancel.addActionListener(this);
        
        
        
        
        setLayout(null);
        setSize(1000,1000);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        
            String accountype =null;
            if(r1.isSelected()){
                accountype = "Savings Account ";
            }
            else if(r2.isSelected()){
                accountype = "Fixed Deposit  Account ";
            }
            else if(r3.isSelected()){
                accountype = "Current Account ";
            }
            else if(r4.isSelected()){
                accountype = "Reccurence Deposit Account ";
            }
            Random ran = new Random();
            long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
            String cardnum = "" + Math.abs(first7);
        
            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pinnumber = "" + Math.abs(first3);
            String facility = "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            }
            else if(c2.isSelected()){
                facility = facility + "Internet Banking";
            }
            else if(c3.isSelected()){
                facility = facility + "Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + "Email And SMS Aletrs";
            }
            else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }
            else if(c6.isSelected()){
                facility = facility + "E-Statement";
            }
            try{
                if(ae.getSource()==submit){
                    if(accountype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
                 else{
                        
                    
            
            
            
                Conn c = new Conn();
                String query2 = "insert into signupthree values('"+formno+"','"+accountype+"','"+cardnum+"','"+pinnumber+"','"+facility+"')";
                String query3 = "insert into login values('"+formno+"','"+cardnum+"','"+pinnumber+"')";    
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null,"Card Number : "+cardnum +"\n"+ "Pin Number : "+pinnumber );
                setVisible(false);
                new Deposit(pinnumber).setVisible(false);
                setVisible(false);
                }
             }
            else if(ae.getSource()==cancel){
            System.exit(0);
        }
            
         
            
            }catch(Exception e){
                System.out.println(e);
            }
        
        
    }

    
    public static void main(String args[]) {
        new SignUpThree("");
    }
}
