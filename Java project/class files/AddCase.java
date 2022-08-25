import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddCase extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,emp;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1,c2;
    
    AddCase(){
        
        super("Add case");
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
       
        
        
        l1 = new JLabel("License no : ");
        t1 = new JTextField(15);
        
        l1.setBounds(40,80,100,20);
        t1.setBounds(160,80,200,20);
        add(l1);
        add(t1);
       
        
        l3 = new JLabel("Name: ");
        t3 = new JTextField(15);
        
        l3.setBounds(40,160,100,20);
        t3.setBounds(160,160,200,20);
        add(l3);
        add(t3);
        
        l4 = new JLabel("section: ");
        t4 = new JTextField(15);
        
        l4.setBounds(40,200,100,20);
        t4.setBounds(160,200,200,20);
        add(l4);
        add(t4); 
        
        
        //l6 = new JLabel("Email : ");
       // t6 = new JTextField(15);
        
        //l6.setBounds(40,280,100,20);
        //t6.setBounds(160,280,200,20);
        //add(l6);
        //add(t6);
        
        
        
        b1 =new JButton("Update");
        b2 = new JButton("cancel");
        
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
            String n = t1.getText();
            
            String a = t3.getText();
            String s = t4.getText();
            String temp;
            int temp1=0,temp2=0,temp3=0,temp4=0;
            //String qry = "update employee set name='"+n+"',gender='"+g+"',address='"+a+"',state='"+s+"',city='"+c+"',email='"+e+"',phone='"+p+"'   where id="+c2.getSelectedItem();
       
            try{
                connection c1 = new connection();
                
                ResultSet rs= c1.s.executeQuery("select * from merits where section = '"+s+"'");
                if(rs.next()){
                    temp1=rs.getInt("points");
                }
                temp4=temp1;
                
                ResultSet rs3=c1.s.executeQuery("select * from License where License_No='"+n+"'");
                if(rs3.next()){
                    temp3=rs3.getInt("Merit_Points");
                }
      
                temp1=temp3-temp4;
                c1.s.executeUpdate("update License set Merit_Points = '"+temp1+"' where License_No='"+n+"'");
                JOptionPane.showMessageDialog(null,"successfully filed case");
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
        new AddCase();
    }
}