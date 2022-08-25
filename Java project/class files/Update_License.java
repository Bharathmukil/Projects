import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Update_License extends JFrame implements ActionListener{
    JLabel l0,l1,l2,l3,l4,l5,l6,l7,emp;
    JTextField t0,t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1,c2;
    
    Update_License(){
        
        super("Update License");
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        l0 = new JLabel("License No");
        t0 = new JTextField(15);
        
        l0.setBounds(40,40,100,20);
        t0.setBounds(160,40,200,20);
        add(l0);
        add(t0);
        
        l1 = new JLabel("Name : ");
        t1 = new JTextField(15);
        
        l1.setBounds(40,80,100,20);
        t1.setBounds(160,80,200,20);
        add(l1);
        add(t1);
       
        c1 = new Choice();
        c1.add("Male");
        c1.add("Female");
       
        l2 = new JLabel("Gender : ");
        
        l2.setBounds(40,120,100,20);
        c1.setBounds(160,120,200,20);
        add(l2);
        add(c1);
        
        l3 = new JLabel("DOB : ");
        t3 = new JTextField(15);
        
        l3.setBounds(40,160,100,20);
        t3.setBounds(160,160,200,20);
        add(l3);
        add(t3);
        
        l4 = new JLabel("Address : ");
        t4 = new JTextField(15);
        
        l4.setBounds(40,200,100,20);
        t4.setBounds(160,200,200,20);
        add(l4);
        add(t4); 
        
        l5 = new JLabel("Phone : ");
        t5 = new JTextField(15);
        
        l5.setBounds(40,240,100,20);
        t5.setBounds(160,240,200,20);
        add(l5);
        add(t5);
        
        l6 = new JLabel("Merit_Points : ");
        t6 = new JTextField(15);
        
        l6.setBounds(40,280,100,20);
        t6.setBounds(160,280,200,20);
        add(l6);
        add(t6);
        
        
        
        b1 =new JButton("Update");
        b2 = new JButton("Delete");
        
        b1.setBounds(40,400,150,30);
        b2.setBounds(200,400,150,30);
        add(b1);
        add(b2);
        
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
      
        setVisible(true);
        setSize(400,550);
        setLocation(600,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
        	String p = t0.getText();
        	String n = t1.getText();
            String g = c1.getSelectedItem();
            String a = t3.getText();
            String s = t4.getText();
            String c = t5.getText();
            String e = t6.getText();
            //int c2 = Integer.parseInt(c);
            int e1 = Integer.parseInt(e);
    		
            String qry = "update License set License_No='"+p+"',Name='"+n+"',Gender='"+g+"',DOB='"+a+"',Address='"+s+"',Phone='"+c+"',Merit_points='"+e1+"'   where License_No='"+p+"'";
       
            try{
                connection c1 = new connection();
                c1.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null,"License Updated");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
        
        if(ae.getSource()==b2){
            try{
            	String p = t0.getText();
                connection c1 = new connection();
                c1.s.executeUpdate("delete from License where License_No='"+p+"'");
                JOptionPane.showMessageDialog(null,"License Cancelled.");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
    
   
    
    public static void main(String[] args){
        new Update_License();
    }
    
}
