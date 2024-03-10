package JAVA_SWING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myframe extends JFrame implements ActionListener{
    // Class definition extending JFrame and implementing ActionListener interface
     
    JButton button; // Declare a JButton variable named button outside constructor so that the issue of using the same variable in actionperformer doesnt give an error
    myframe(){
        //created a frame which extends Jframe
        //adding a action listener 
        button = new JButton(); //creates a button
        button.setBounds(200,100,100,50); //sets button size
        button.addActionListener(this); //addding the action listener to the this frame sothat the output it visible
        // Add an ActionListener to the button (this refers to the current instance of myframe)
        //instead of using all of this code for action listener and all we can use lamda expression too --- so the code becomes button.addActionListener(e -> Sysout("hey")); // this will also work but its an advanced concept 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Set layout to null (for manual component positioning)
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override // Method to handle button click events
    public void actionPerformed(ActionEvent e) {
        //this is the
        if(e.getSource()==button){ // Check if the event source is the button
            System.out.println("Well done");
        }
        
    }
}
