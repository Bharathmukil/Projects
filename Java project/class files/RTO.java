import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RTO extends JFrame implements ActionListener{
    RTO(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/d1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
    
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("License");
        m1.setForeground(Color.blue);
        JMenuItem t1 = new JMenuItem("Add license");
    
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        

    
        JMenuItem t3 = new JMenuItem("Update License");
        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('S');
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
         m1.add(t1);
        //m1.add(t2);
        m1.add(t3);
        mb.add(m1);
        t1.addActionListener(this);
        //t2.addActionListener(this);
        t3.addActionListener(this);
        
        JMenu edit =new JMenu("merits");
        edit.setForeground(Color.RED);
   
        mb.add(edit);
        JMenuItem s1 = new JMenuItem("Add Merits");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("monospaced",Font.PLAIN,12));
        s1.setMnemonic('U');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
    
        edit.add(s1);
    
        JMenuItem s2 = new JMenuItem("update Merits");
   
        s2.setForeground(Color.blue);
        s2.setFont(new Font("monospaced",Font.PLAIN,12));
        s2.setMnemonic('p');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
   
        
        edit.add(s2);
        
        JMenu m11 = new JMenu("view");
        m11.setForeground(Color.blue);
        JMenuItem t11 = new JMenuItem("canceled license");
    
        t11.setForeground(Color.blue);
        t11.setFont(new Font("monospaced",Font.PLAIN,12));
        t11.setMnemonic('N');
        t11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        m11.add(t11);
        mb.add(m11);
        t11.addActionListener(this);

        s1.addActionListener(this);
        s2.addActionListener(this);
        
        JMenu rep =new JMenu("Reports");
        rep.setForeground(Color.blue);
        
        JMenu m8=new JMenu("Exit");
        m8.setForeground(Color.red);
        mb.add(m8);
        JMenuItem m8i1=new JMenuItem("Exit");
        m8.add(m8i1);
        m8i1.setForeground((Color.blue));
        m8i1.setFont(new Font("monospaced", Font.PLAIN, 14));
        m8i1.setMnemonic('X');
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/exit.PNG")));
        m8i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        m8i1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
        if(msg.equals("Add license")){
            new New_License().setVisible(true);
        }
        else if(msg.equals("Update License")){
            new Update_License().setVisible(true);
        }
        else if(msg.equals("Add Merits")){
            new New_Merits().setVisible(true);
        }
        else if(msg.equals("update Merits")){
            new Update_Merits().setVisible(true);
        }
        
       else if(msg.equals("canceled license")){
            new Cancel_license().setVisible(true);
        
        }
        else if(msg.equals("Exit"))
            System.exit(0);
    }
    public static void main(String[] args){
        new RTO().setVisible(true);
    }
    
}