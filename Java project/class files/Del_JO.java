import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Del_JO extends JFrame implements ActionListener{
     JLabel l1,l2,l3,l4,l5,l6,l7,emp;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1,c2;
    
    Del_JO(){
        super("Delete JO");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
         JPanel p1= new JPanel();
         p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("id : ");
        t1 = new JTextField(15);
        
        l1.setBounds(40,80,100,20);
        t1.setBounds(160,80,200,20);
        add(l1);
        add(t1);
       
        b1 =new JButton("delete");
        b2 = new JButton("Cancel");
        b1.setBounds(40,400,150,30);
        b2.setBounds(200,400,150,30);
        add(b1);
        add(b2);
        
        setLayout(new BorderLayout());
       
       
        //b2 = new JButton("Delete");
        
        
      add(p1,"Center");
      setSize(400,550);
        setLocation(600,200);
       
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
         try{
                connection c1 = new connection();
                c1.s.executeUpdate("delete from JudicialOfficer where id="+n);
                JOptionPane.showMessageDialog(null,"Employee Deleted");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
    	 }
    	 if(ae.getSource()==b2){
    		 this.setVisible(false);

         }
     }
     
    
    public static void main(String[] args){
        new Del_JO().setVisible(true);
    }
    
}