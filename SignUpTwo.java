
package bank.managementsystem;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener {
    
    JLabel l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JComboBox c1,c2,c3,c4,c5;
    JTextField t4,t5;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup grp2,grp3;
    JButton b3;
    String formno;
    public SignUpTwo(String formno){
        this.formno = formno;
        l5 = new JLabel("Page 2 : Additional Details ");
        l5.setBounds(200, 50, 600, 80);
        l5.setFont(new Font("Railways",Font.BOLD,20));
        add(l5);
        
        l6 = new JLabel("Religion");
        l6.setBounds(100, 130, 600, 30);
        l6.setFont(new Font("Railways",Font.BOLD,20));
        add(l6);
        String reg[] = {"Hindu","Muslim","Christian"};
        c1 = new JComboBox(reg);
        c1.setBounds(250, 140, 300, 20);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        
        
        l7 = new JLabel("Category");
        l7.setBounds(100, 180, 600, 30);
        l7.setFont(new Font("Railways",Font.BOLD,20));
        add(l7);
        String cat[] = {"BC","OBC","SC","ST","Others"};
        c2 = new JComboBox(cat);
        c2.setBounds(250, 190, 300, 20);
        c2.setBackground(Color.WHITE);
        add(c2);
        
        l8 = new JLabel("Income");
        l8.setBounds(100, 230, 600, 30);
        l8.setFont(new Font("Railways",Font.BOLD,20));
        add(l8);
        
        String cat_INC[] = {"Null","<1,00,000","<=1,00,000",">1,00,000"};
        c3 = new JComboBox(cat_INC);
        c3.setBounds(250, 240, 300, 20);
        c3.setBackground(Color.WHITE);
        add(c3);

        
        l9 = new JLabel("Educational Qulaification");
        l9.setBounds(100, 280, 600, 30);
        l9.setFont(new Font("Railways",Font.BOLD,20));
        add(l9);
        
        String cat_QUA[] = {"Nill","Btech","Mtech","MBA","Others"};
        c4 = new JComboBox(cat_QUA);
        c4.setBounds(350, 290, 300, 20);
        c4.setBackground(Color.WHITE);
        add(c4);
        
        
        l10 = new JLabel("Occupation");
        l10.setBounds(100, 330, 600, 30);
        l10.setFont(new Font("Railways",Font.BOLD,20));
        add(l10);
        
        String cat_Occ[] = {"Self_Employed","Business","Startup","Others"};
        c5 = new JComboBox(cat_Occ);
        c5.setBounds(250, 340, 300, 20);
        c5.setBackground(Color.WHITE);
        add(c5);
        
        
        l11 = new JLabel("Pan Number");
        l11.setBounds(100, 380, 600, 30);
        l11.setFont(new Font("Railways",Font.BOLD,20));
        add(l11);
        
        t4 = new JTextField();
        t4.setBounds(250, 390, 200, 30);
        t4.setFont(new Font("Railways",Font.BOLD,20));
        t4.setBackground(Color.WHITE);
        add(t4);
        
        l12 = new JLabel("Aadhar Number");
        l12.setBounds(100, 430, 600, 30);
        l12.setFont(new Font("Railways",Font.BOLD,20));
        add(l12);
        
        t5 = new JTextField();
        t5.setBounds(250, 440, 200, 30);
        t5.setFont(new Font("Railways",Font.BOLD,20));
        t5.setBackground(Color.WHITE);
        add(t5);
        
        
        l13 = new JLabel("Senior Citizen");
        l13.setBounds(100, 480, 600, 30);
        l13.setFont(new Font("Railways",Font.BOLD,20));
        add(l13);
        
        r1 = new JRadioButton("Yes");
        r1.setBounds(250, 490, 50, 30);
        r1.setBackground(Color.WHITE);
        r2 = new JRadioButton("No");
        r2.setBounds(350, 490, 50, 30);
        r2.setBackground(Color.WHITE);
        grp2 = new ButtonGroup();
        grp2.add(r1);
        grp2.add(r2);
        add(r1);
        add(r2);
        
        l14 = new JLabel("Existing Account");
        l14.setBounds(100, 530, 600, 30);
        l14.setFont(new Font("Railways",Font.BOLD,20));
        add(l14);
        
        r3 = new JRadioButton("Yes");
        r3.setBounds(280, 540, 50, 30);
        r3.setBackground(Color.WHITE);
        r4 = new JRadioButton("No");
        r4.setBounds(380, 540, 50, 30);
        r4.setBackground(Color.WHITE);
        grp3 = new ButtonGroup();
        grp3.add(r3);
        grp3.add(r4);
        add(r3);
        add(r4);
        
        b3 = new JButton("NEXT");
        b3.setBounds(300, 600, 100, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        add(b3);
        b3.addActionListener(this);
        
        
        
        
        
        setLayout(null);
        setSize(800,800);
        setVisible(true);
        setTitle("Additional Details");
        getContentPane().setBackground(Color.WHITE);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreg = (String)c1.getSelectedItem();
        String scat = (String)c2.getSelectedItem();
        String sinc = (String)c3.getSelectedItem();
        String sedu = (String)c4.getSelectedItem();
        String soccu = (String)c5.getSelectedItem();
        String sencit ="null";
        if(r1.isSelected()){
            sencit = "Yes";
        }
        else if(r2.isSelected()){
            sencit = "No";
        }
        String existacc ="null";
        if(r3.isSelected()){
            sencit = "Yes";
        }
        else if(r4.isSelected()){
            sencit = "No";
        }
        String pan = t4.getText();
        String aadhar = t5.getText();
        
        try{
            if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "Pan Number Is Mandatory");
            }
            else
            {
                Conn c = new Conn();
                String query1 = "insert into signuptwo values('"+formno+"','"+sreg+"','"+scat+"','"+sinc+"','"+sedu+"','"+soccu+"','"+sencit+"','"+pan+"','"+aadhar+"')";
                c.s.executeUpdate(query1);
                
                setVisible(false);
                new SignUpThree(formno).setVisible(true);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    public static void main(String args[]) {
        new SignUpTwo("");
    }
}
