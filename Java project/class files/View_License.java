import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View_License extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"License_No","Name","Gender","DOB","Address","Phone","Merit_Points"};
    String d[][]=new String[1][8];  
    int i=0,j=0;
    String License_No;
    
    View_License(String s){
        super("View License");
        this.License_No = s;
        setSize(1000,200);
        setLocation(450,200);
        

        try{
            String q="select * from License where License_No='"+s+"'";
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
                d[i][j++]=rs.getString("Merit_Points");
                //d[i][j++]=rs.getString("phone");
                i++;
                j=0;
            }
            j1=new JTable(d,h); 

        }
        catch(Exception e){}
        
        b1=new JButton("exit");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
        	setVisible(false);
           //j1.print();
        }catch(Exception e){}
    }
     
    public static void main(String s[]){
    	System.out.print(s[0]);
        new View_License(s[0]).setVisible(true);
    }
}

