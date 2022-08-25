import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cancel_license extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"License_No","Name","Gender","DOB","Address","Phone","Merit_Points"};
    String d[][]=new String[20][7];  
    int i=0,j=0;
    
    Cancel_license(){
        super("licenses to be cancel");
        
        setSize(1000,400);
        setLocation(450,200);

        try{
            String q="select * from License where Merit_Points<50";
            connection c1=new connection();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                // i = 0 j = 0
                d[i][j++]=rs.getString("License_No");
                d[i][j++]=rs.getString("Name");
                d[i][j++]=rs.getString("Gender");
                d[i][j++]=rs.getString("DOB");
                d[i][j++]=rs.getString("Address");
                d[i][j++]=rs.getString("Phone");
                d[i][j++]=rs.getString("Merit_points");
             
                i++;
                j=0;
            }
            j1=new JTable(d,h); 

        }
        catch(Exception e){}
        
        b1=new JButton("Cancel License");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==b1){
            try{
            	String q="select * from License where Merit_Points<50";
                connection c1=new connection();
                ResultSet rs1=c1.s.executeQuery(q);
                while(rs1.next()){
                	String s = rs1.getString("License_No");
                	c1.s.executeUpdate("delete from License where License_No ='"+s+"'");
                }
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
    	}
    }
     
    public static void main(String s[]){
        new Cancel_license().setVisible(true);
    }
}