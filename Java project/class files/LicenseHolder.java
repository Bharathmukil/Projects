import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LicenseHolder extends JFrame implements ActionListener{
    
    LicenseHolder(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/d1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
    
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("View");
        m1.setForeground(Color.blue);
        JMenuItem t1 = new JMenuItem("License Detail");
    
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        
         m1.add(t1);
        //m1.add(t2);
       // m1.add(t3);
        mb.add(m1);
        t1.addActionListener(this);
        //t2.addActionListener(this);
        //t3.addActionListener(this);
        
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
        if(msg.equals("License Detail")){
            new LicenseHolderLogin().setVisible(true);
        }
        
        else if(msg.equals("Exit"))
            System.exit(0);
    }
    public static void main(String[] args){
        new LicenseHolder().setVisible(true);
    }
    
}
