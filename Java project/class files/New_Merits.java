import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class New_Merits extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1;
    
    New_Merits(){
        
        super("New_Merits");
        
        setSize(600,750);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,45));
        l1 = new JLabel("section");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
        
        l3 = new JLabel("Merits");
        t3 = new JTextField(15);
        p1.add(l3);
        p1.add(t3);
        
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
	        String a = t3.getText();    
	        String qry1 = "insert into merits values('"+n+"',"+a+")";
	        try{
	            connection c1 = new connection();
	            //c1.s.executeUpdate(qry);
	            c1.s.executeUpdate(qry1);
	            JOptionPane.showMessageDialog(null,"Merit added");
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
        new New_Merits().setVisible(true);
    }
    
}