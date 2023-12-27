
package bank.managementsystem;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {
    long randam;
    JTextField nt,ft,mt,at,ct,st,pt;
    JLabel formno1,personaldet,name,fname,dob,gender,email,address,ms,city,state,pincode;
    JRadioButton male,female,yes,no;
    JDateChooser datechooser;
    JButton next;
    ButtonGroup grp,grp1;
    //String formno;
    Random ran = new Random();
    long first4 =Math.abs(( ran.nextLong() % 900L) + 100L);
    String first = ""+Math.abs(first4);
        
    public SignUpOne(){
        //formno = this.formno;
        
        
        
        formno1 = new JLabel("APPLICATION NUMBER " +randam);
        formno1.setFont(new Font("Osward",Font.BOLD,30));
        formno1.setBounds(140, 60, 600, 100);
        add(formno1);
        
        
        personaldet = new JLabel("Page 1: Personal Details ");
        personaldet.setFont(new Font("Osward",Font.BOLD,20));
        personaldet.setBounds(180, 130, 600, 40);
        add(personaldet);
        
        
        name = new JLabel("Name : ");
        name.setFont(new Font("Osward",Font.BOLD,20));
        name.setBounds(100, 170, 600, 40);
        add(name);
        
        nt = new JTextField();
        nt.setBounds(300, 180, 400, 30);
        nt.setFont(new Font("Osward",Font.BOLD,20));
        add(nt);
        
        
        fname = new JLabel("FatherName : ");
        fname.setFont(new Font("Osward",Font.BOLD,20));
        fname.setBounds(100, 200, 600, 40);
        add(fname);
        
        
        ft = new JTextField();
        ft.setBounds(300, 210, 400, 30);
        ft.setFont(new Font("Osward",Font.BOLD,20));
        add(ft);
        
        
        
         dob = new JLabel("Date Of Birth : ");
        dob.setFont(new Font("Osward",Font.BOLD,20));
        dob.setBounds(100, 230, 600, 40);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(300, 240, 200, 40);
        datechooser.setFont(new Font("Osward",Font.BOLD,20));
        datechooser.setForeground(Color.BLACK);
        add(datechooser);
        
         gender = new JLabel("Gender : ");
        gender.setFont(new Font("Osward",Font.BOLD,20));
        gender.setBounds(100, 265, 600, 40);
        add(gender);
        
        male  = new JRadioButton("Male");
        male.setBounds(300, 280, 80, 10);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        female  = new JRadioButton("Female");
        female.setBounds(400, 280, 80, 10);
        female.setBackground(Color.WHITE);
        add(female);
        
        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);
        
        
        email = new JLabel("Email : ");
        email.setFont(new Font("Osward",Font.BOLD,20));
        email.setBounds(100, 290, 600, 40);
        add(email);
        
        mt = new JTextField();
        mt.setBounds(300, 300, 400, 30);
        mt.setFont(new Font("Osward",Font.BOLD,20));
        add(mt);
        
        
        
        ms = new JLabel("Martial Status : ");
        ms.setFont(new Font("Osward",Font.BOLD,20));
        ms.setBounds(100, 320, 600, 40);
        add(ms);
        
        yes  = new JRadioButton("Yes");
        yes.setBounds(300, 340, 80, 10);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        
        no  = new JRadioButton("No");
        no.setBounds(400, 340, 80, 10);
        no.setBackground(Color.WHITE);
        add(no);
        
        grp1 = new ButtonGroup();
        grp1.add(yes);
        grp1.add(no);
        
        
        
        address = new JLabel("Address : ");
        address.setFont(new Font("Osward",Font.BOLD,20));
        address.setBounds(100, 350, 600, 40);
        add(address);
        
        
        at = new JTextField();
        at.setBounds(300, 360, 400, 30);
        at.setFont(new Font("Osward",Font.BOLD,20));
        add(at);
        
        
        city = new JLabel("City : ");
        city.setFont(new Font("Osward",Font.BOLD,20));
        city.setBounds(100, 380, 600, 40);
        add(city);
        
        
        ct = new JTextField();
        ct.setBounds(300, 390, 400, 30);
        ct.setFont(new Font("Osward",Font.BOLD,20));
        add(ct);
        
        
        state = new JLabel("State : ");
        state.setFont(new Font("Osward",Font.BOLD,20));
        state.setBounds(100, 410, 600, 40);
        add(state);
        
        
        st = new JTextField();
        st.setBounds(300, 420, 400, 30);
        st.setFont(new Font("Osward",Font.BOLD,20));
        add(st);
        
        
        pincode = new JLabel("Pincode : ");
        pincode.setFont(new Font("Osward",Font.BOLD,20));
        pincode.setBounds(100, 440, 600, 40);
        add(pincode);
        
        
        pt = new JTextField();
        pt.setBounds(300, 450, 400, 30);
        pt.setFont(new Font("Osward",Font.BOLD,20));
        add(pt);
        
        
        next = new JButton("Next");
        next.setBounds(350, 500, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway",Font.BOLD,20));
        add(next);
        next.addActionListener(this);
        
        setTitle("Personal Details");
        setLayout(null);
        setSize(800,800);
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = first;//long val
        String name = nt.getText();
        String fname = ft.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        String email = mt.getText();
        String ms = null;
        if(yes.isSelected()){
            ms = "Yes";
        }
        else if (no.isSelected()){
            ms = "No";
        }
        String address = at.getText();
        String city = ct.getText();
        String state = st.getText();
        String pincode = pt.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name Is Mandatory");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+ms+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignUpTwo(first).setVisible(true);
                
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    public static void main(String args[]) {
        new SignUpOne();
    }

    
}
