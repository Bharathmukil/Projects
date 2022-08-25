import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Update_Merits extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2,b3;
    Choice c1;
    
    Update_Merits(){
        
        super("Update_Merits");
        
        setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("section");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
        
        l3 = new JLabel("Merits");
        t3 = new JTextField(15);
        p1.add(l3);
        p1.add(t3);
        
        b1 =new JButton("Submit");
        b3=new JButton("delete");
        b2 = new JButton("Cancel");
        
        p1.add(b1);
        p1.add(b3);
        p1.add(b2);
       
        setLayout(new BorderLayout());
        add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/d2.png"))),"West");
        add(p1,"Center");
       
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
    }
     public void actionPerformed(ActionEvent ae){
       
        String n = t1.getText();
        
        String a = t3.getText();
        
        if(ae.getSource()==b1){
        //String qry = "insert into RTO values(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";
        //String qry1 = "update merits set points = '"+a+"' where section ="+n;
        try{
            connection c1=new connection();
            //c1.s.executeUpdate(qry);
            c1.s.executeUpdate("update merits set points = '"+a+"' where section ='"+n+"'");
            JOptionPane.showMessageDialog(null,"Merit updated");
            this.setVisible(false);  
        }catch(Exception ee){
            ee.printStackTrace();
        }
        }
        if(ae.getSource()==b3){
            try{
            connection c2 = new connection();
            
            c2.s.executeUpdate("delete from merits where section ='"+n+"'");
            JOptionPane.showMessageDialog(null,"Merit deleted");
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
        new Update_Merits().setVisible(true);
    }
    
}