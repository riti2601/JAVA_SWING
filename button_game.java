package JAVA_SWING;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class button_game extends JFrame implements ActionListener {
    
    JButton button1;
    JButton button2; 
    JButton button3;
    JLabel label;
    JLabel label1;
    JPanel homePanel;

    button_game(){

        homePanel = new JPanel();
        label = new JLabel();
        label.setText("<html>WELCOME TO THE DUNGEON!! <br/> ---------------------------------------------<br/>Do you want to enter the dungeon?</html>");
        label.setBounds(100,0,700,100);
                
        button1 = new JButton();
        button1.setBounds(50, 100, 100, 50);
        button1.setText("YES!");
        button1.setFocusable(false);
        button1.addActionListener(this);
        
        label1 = new JLabel();
        label1.setText("<html>LETS START THE ADVENTURE!<br/>I hope the odds are in your favour fighter!");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setBounds(100, 125, 250, 100);
        label1.setVisible(false);
        
        button2 = new JButton();
        button2.setBounds(150, 215, 100, 50);
        button2.setText("Proceed");
        button2.setFocusable(false);
        button2.setVisible(false);
        
        button3 = new JButton();
        button3.setBounds(250, 100, 100, 50);
        button3.setText("No!");
        button3.setFocusable(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); 
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(label);
        this.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
        System.out.println("I hope the odds are in your favour fighter!");
        label1.setVisible(true);
        button2.setVisible(true);
        button1.setEnabled(false);
        button3.setEnabled(false);;
        }
        if(e.getSource()==button3){

        }
    }

}
