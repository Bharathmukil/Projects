import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class preindex extends JFrame implements ActionListener{
    Choice c1;
    JLabel l1,l2;
    JButton b3,b2;
    
    preindex(){
        super("Login");
        setLayout(new BorderLayout());
        setSize(400,250);
        setLocation(600,400);	
        setVisible(true);
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        
        c1 = new Choice();
        c1.add("Judicial officer");
        c1.add("licence holder");
        c1.add("admin");
        c1.add("rto");
        l2 = new JLabel("Gender");
        p1.add(l2);
        p1.add(c1);
        
        b3 = new JButton("Submit", new ImageIcon(ClassLoader.getSystemResource("icon\\login.png")));
        b2 = new JButton("Cancel", new ImageIcon(ClassLoader.getSystemResource("icon\\Cancel.png")));
        
        b3.addActionListener(this);
        b2.addActionListener(this);
        p2.add(b3);
        p2.add(b2);
        //add(p2,BorderLayout.SOUTH);
        setLayout(new BorderLayout());
        add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/d2.png"))),"West");
        add(p1,"Center");
        
        //p2.add(b1);
        
        //p2.add(b2);
        add(p2,BorderLayout.SOUTH);
        

    }
    public void actionPerformed(ActionEvent ae){
    	String msg= ae.getActionCommand();
    	if(msg.equals("Submit")) {
    		try
    		{
    			connection c=new connection();
    			String g = c1.getSelectedItem();
    			if(g=="Judicial officer"){
    				new JOlogin().setVisible(true);
    				setVisible(false);
    			}else if(g=="licence holder"){
    				new LicenseHolder().setVisible(true);
    				setVisible(false);
    			}else if(g=="admin"){
    				//Adminc.login();
    				new AdminLogin().setVisible(true);
    				setVisible(false);
    			}else if(g=="rto"){
    				new RTOlogin().setVisible(true);
    				setVisible(false);
    			}
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    	else if(msg.equals("Cancel"))
    		System.exit(0);
    }
    
    public static void main(String[] args){
        new preindex().setVisible(true);
    }
}