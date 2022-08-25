
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admin extends JFrame implements ActionListener{
    admin(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/d1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
    
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("RTO officer info");
        m1.setForeground(Color.blue);
        JMenuItem t1 = new JMenuItem("Add RTO");
    
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        

    
        JMenuItem t3 = new JMenuItem("delete RTO");
        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('S');
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
         m1.add(t1);
        //m1.add(t2);
        m1.add(t3);
        mb.add(m1);
        t1.addActionListener(this);
        t3.addActionListener(this);
        
        JMenu edit =new JMenu("Judicial officer info");
        edit.setForeground(Color.blue);
   
        mb.add(edit);
        JMenuItem s1 = new JMenuItem("Add JO");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("monospaced",Font.PLAIN,12));
        s1.setMnemonic('U');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
    
        edit.add(s1);
    
        JMenuItem s2 = new JMenuItem("delete JO");
   
        s2.setForeground(Color.blue);
        s2.setFont(new Font("monospaced",Font.PLAIN,12));
        s2.setMnemonic('p');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
   
        
        edit.add(s2);
        
        
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
        if(msg.equals("Add RTO")){
            new New_RTO().setVisible(true);
        }
        else if(msg.equals("Add JO")){
            new New_JO().setVisible(true);
        }
        else if(msg.equals("delete RTO")){
            new Del_RTO().setVisible(true);
        }
        else if(msg.equals("delete JO")){
            new Del_JO().setVisible(true);
        }
        else if(msg.equals("Exit"))
            System.exit(0);
    }
    public static void main(String[] args){
        new admin().setVisible(true);
    }
    
}
