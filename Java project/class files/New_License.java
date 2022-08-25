import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class New_License extends JFrame implements ActionListener{
    JLabel l0,l1,l2,l3,l4,l5,l6,l7;
    JTextField t0,t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1;
    
    New_License(){
        
        super("New License");
        
        setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        
        l0 = new JLabel("License No");
        t0 = new JTextField(15);
        p1.add(l0);
        p1.add(t0);
        
        l1 = new JLabel("Name");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
        c1 = new Choice();
        c1.add("Male");
        c1.add("Female");
       
        l2 = new JLabel("Gender:");
        p1.add(l2);
        p1.add(c1);
        l3 = new JLabel("DOB (YYYY-MM-DD):");
        t3 = new JTextField(15);
        p1.add(l3);
        p1.add(t3);
        l4 = new JLabel("Address");
        t4 = new JTextField(15);
        p1.add(l4);
        p1.add(t4); 
        l5 = new JLabel("Phone:");
        t5 = new JTextField(15);
        p1.add(l5);
        p1.add(t5);
        //l6 = new JLabel("Merit Points");
        //t6 = new JTextField(15);
        //p1.add(l6);
        //p1.add(t6);
        //l7 = new JLabel("Phone");
        //t7= new JTextField(15);
        //p1.add(l7);
        //p1.add(t7);
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
    		String p = t0.getText();
    		String n = t1.getText();
    		String g = c1.getSelectedItem();
    		String a = t3.getText();
    		String s = t4.getText();
    		String c = t5.getText();
    		//int c2 = Integer.parseInt(c);
    		int d = 100;
    		String qry = "insert into License values('"+p+"','"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+d+"')";
    		String qry2= "insert into lhlogin values('"+p+"','"+a+"')";
    		try{
    			connection c1 = new connection();
    			c1.s.executeUpdate(qry);
    			c1.s.executeUpdate(qry2);
    			JOptionPane.showMessageDialog(null,"License created");
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
        new New_License().setVisible(true);
    }
}
