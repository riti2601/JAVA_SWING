package JAVA_SWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class layout_game extends JFrame implements ActionListener{

    static JButton yes;
    static JButton no;
    static JButton proceed;

    layout_game(){
    //button for yes
    yes = new JButton();
    yes.setBounds(0,0,60,500);
    yes.setText("<html><h2>YES</h2></html>");
    yes.setFocusable(false);
    yes.setBackground(Color.GREEN);
    yes.addActionListener(this);

    //button for no
    no = new JButton();
    no.setBounds(0,0,60,500);
    no.setText("<html><h2>NO</h2></html>");
    no.setFocusable(false);
    no.setBackground(Color.RED);
    no.addActionListener(this);

    proceed = new JButton();
    proceed.setFocusable(false);
    proceed.setText("<html><h2>PROCEED TO THE DUNGEON</h2><h3>LETS START THE ADVENTURE!<br/>I hope the odds are in your favour fighter!<h3></html>");
    proceed.setVisible(false);
    proceed.setBackground(Color.BLACK);
    proceed.setForeground(Color.WHITE);
    proceed.addActionListener(this);


    this.add(yes);
    this.add(no);
    this.add(proceed);
    }

    public static void main(String[] args) {

    //frame creation
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,600);
    frame.setLayout(new BorderLayout(5,5));
    frame.setVisible(true);

    //panels at the north, south, east, west, center resp
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    //label for header, footer, center
    JLabel label1 = new JLabel("<html><h1>DUNGEON AWAITS</h1></html>");
    label1.setForeground(new Color(150,10,30));
    JLabel label2 = new JLabel("<html><h2>CREATED BY: RITISHA PANDE</h2></html>");
    label2.setForeground(Color.BLACK);
    JLabel label5 = new JLabel("<html><h1>WELCOME TO THE DUNGEON!</h1><br><h2>DO YOU WANT TO ENTER THE DUNGEON?<br>Click on the either side of the screen.</h2></html>");


    //colors to panels
    panel1.setBackground(Color.BLACK);
    panel2.setBackground(Color.DARK_GRAY);
    panel5.setBackground(Color.LIGHT_GRAY);

    //size of panels 
    panel1.setPreferredSize(new Dimension(100,50));
    panel2.setPreferredSize(new Dimension(50,50));
    panel3.setPreferredSize(new Dimension(60,100));
    panel4.setPreferredSize(new Dimension(60,100));
    panel5.setPreferredSize(new Dimension(100,100));

    new layout_game();
    //adding components to panel
    panel3.setLayout(new BorderLayout());
    panel4.setLayout(new BorderLayout());
    panel5.setLayout(new BorderLayout());
    panel4.add(yes);
    panel3.add(no);
    panel5.add(proceed, BorderLayout.SOUTH);
    panel1.add(label1);
    panel2.add(label2);
    panel5.add(label5, BorderLayout.NORTH);



    //adding panels to frame
    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.SOUTH);
    frame.add(panel3, BorderLayout.EAST);
    frame.add(panel4, BorderLayout.WEST);
    frame.add(panel5, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==yes){
            System.out.println("YES");
            proceed.setVisible(true);
        }
        else if(e.getSource()==no){
            System.out.println("NO");
        }
        else if(e.getSource()==proceed){
            proceed.setEnabled(false);
            System.out.println("proceed");
        }
    }
    
    
    
}
