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

public class button_game extends JFrame implements ActionListener {
    
    JButton button1;
    JButton button2; 
    JButton button3;
    JButton game;
    JLabel label;
    JLabel label1;
    JPanel homePanel;
    JPanel panel;
    JPanel header;
    JPanel footer;

    button_game(){
        this.setLayout(new BorderLayout());

        homePanel = new JPanel();
        homePanel.setLayout(null); // Set layout to null for manual positioning
        homePanel.setBounds(0,0,500,500);
        panel = new JPanel();
        panel.setBounds(0,0,500,500);
        panel.setBackground(Color.BLACK);
        panel.setVisible(false);

        header = new JPanel();
        footer = new JPanel();
        header.setBackground(Color.yellow);
        header.setPreferredSize(new Dimension(100,100));
        footer.setBackground(Color.LIGHT_GRAY);
        header.setPreferredSize(new Dimension(100,100));



        label = new JLabel();
        label.setText("<html>WELCOME TO THE DUNGEON!! <br/> ---------------------------------------------<br/>Do you want to enter the dungeon?</html>");
        label.setBounds(100,0,700,100);
        header.add(label);
        //homePanel.add(label);
                
        button1 = new JButton();
        button1.setBounds(50, 100, 100, 50);
        button1.setText("YES!");
        button1.setFocusable(false);
        button1.addActionListener(this);
        homePanel.add(button1);
       
        
        label1 = new JLabel();
        label1.setText("<html>LETS START THE ADVENTURE!<br/>I hope the odds are in your favour fighter!");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setBounds(100, 150, 300, 100); 
        label1.setVisible(false);
        homePanel.add(label1);
        
        button2 = new JButton();
        button2.setBounds(150, 250, 100, 50); 
        button2.setText("Proceed");
        button2.setFocusable(false);
        button2.setVisible(false);
        button2.addActionListener(this); 
        homePanel.add(button2);
        
        button3 = new JButton();
        button3.setBounds(250, 100, 100, 50);
        button3.setText("No!");
        button3.setFocusable(false);
        button3.addActionListener(this);
        homePanel.add(button3);

        game = new JButton();
        game.setBounds(0,0,400,400);
        game.setText("GAME");
        game.setFocusable(false);
        game.addActionListener(this);
        panel.add(game);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); 
        this.setSize(500,500);
        this.setVisible(true);
        this.add(header, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
        this.add(homePanel); 
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            System.out.println("I hope the odds are in your favour fighter!");
            label1.setVisible(true);
            button2.setVisible(true);
            button1.setEnabled(false);
            button3.setEnabled(false);
        }
        else if(e.getSource() == button2){
            System.out.println("im working but the panel is not");
            button2.setEnabled(false);
            panel.setVisible(true);
        }
        else if(e.getSource() == button3){
            System.out.println("Exiting the game."); 
            
        }
    }

    public static void main(String[] args) {
        new button_game();
    }
}