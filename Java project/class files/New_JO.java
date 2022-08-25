import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class New_JO extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1;
    
    New_JO(){
        
        super("New Judicial officer");
        
        setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("Name");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
        c1 = new Choice();
        c1.add("Male");
        c1.add("Female");
       
        l2 = new JLabel("Gender");
        p1.add(l2);
        p1.add(c1);
        l3 = new JLabel("Age");
        t3 = new JTextField(15);
        p1.add(l3);
        p1.add(t3);
        l4 = new JLabel("Office ID");
        t4 = new JTextField(15);
        p1.add(l4);
        p1.add(t4); 
        l5 = new JLabel("Username");
        t5 = new JTextField(15);
        p1.add(l5);
        p1.add(t5);
        l6 = new JLabel("Password");
        t6 = new JTextField(15);
        p1.add(l6);
        p1.add(t6);
        l7 = new JLabel("Phone");
        t7= new JTextField(15);
        p1.add(l7);
        p1.add(t7);
        b1 =new JButton("Submit");
        b2 = new JButton("Cancel");
        p1.add(b1);
        p1.add(b2);
       
        setLayout(new BorderLayout());
        add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/d2.png"))),"West");
        add(p1,"Center");
       
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       
    }
    
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==b1){
        String n = t1.getText();
        String g = c1.getSelectedItem();
        String a = t3.getText();
        String s = t4.getText();
        String c = t5.getText();
        String e = t6.getText();
        String p = t7.getText();
        String qry = "insert into JudicialOfficer values(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";
        String qry1 = "insert into JOlogin values('"+c+"','"+e+"')";
        try{
            connection c1 = new connection();
            c1.s.executeUpdate(qry);
            c1.s.executeUpdate(qry1);
            JOptionPane.showMessageDialog(null,"Judicial officer ID Created");
            this.setVisible(false);  
        }catch(Exception ee){
            ee.printStackTrace();
        }
    	}
    	if(ae.getSource()==b2){
    		this.setVisible(false);

        }
    }
    public static void main(String s[]){
        new New_JO().setVisible(true);
    }
}
