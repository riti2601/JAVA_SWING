package JAVA_SWING;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myframe extends JFrame implements ActionListener{
    // Class definition extending JFrame and implementing ActionListener interface
     
    JButton button; // Declare a JButton variable named button outside constructor so that the issue of using the same variable in actionperformer doesnt give an error
    JLabel label;
    myframe(){
        //created a frame which extends Jframe
        //adding a action listener 

        ImageIcon icon = new ImageIcon("image.png");

        ImageIcon icon2 = new ImageIcon("image.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton(); //creates a button
        button.setBounds(100,100,250,250); //sets button size
        button.addActionListener(this); //addding the action listener to the this frame sothat the output it visible
        // Add an ActionListener to the button (this refers to the current instance of myframe)
        //instead of using all of this code for action listener and all we can use lamda expression too --- so the code becomes button.addActionListener(e -> Sysout("hey")); // this will also work but its an advanced concept 
        button.setText("Click here"); //text on the button
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times Roman",Font.BOLD,25));
        //button.setIconTextGap(-10);
        button.setForeground(Color.MAGENTA);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Set layout to null (for manual component positioning)
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override // Method to handle button click events
    public void actionPerformed(ActionEvent e) {
        //this is the
        if(e.getSource()==button){ // Check if the event source is the button // this isa ction after the button is clicked
            System.out.println("Well done");
            //button.setEnabled(false); //if we want that once the button is pressed it should be disabled we can use this
            label.setVisible(true);
        }
        
    }
}
