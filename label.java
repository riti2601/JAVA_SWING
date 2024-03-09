package JAVA_SWING;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

//label is gui compenent a display are for text, image
public class label {
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("image.png");
        Border border = BorderFactory.createLineBorder(Color.red,5);
        
        JLabel label = new JLabel(); // creates a label
        label.setText("Do you even code??"); // set text of label 
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);// left, center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);// top, center, bottom of imageicon

        label.setForeground(new Color(100,10,0)); // change color of the text ie font color 
        label.setFont(new Font("MV Boli", Font.PLAIN,50));//set font of the text, its size and italic thingie
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(Color.BLACK); 
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal position of icon and text within label
        //label.setBounds(100,100, 250, 250); //this sets x and y position within frame as well as dimensions


        label.setBorder(border);// added border to the label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
       // frame.setLayout(null); // to fx the lable at a particular position
        frame.setTitle("lets code");
        frame.add(label);
        
        frame.pack(); // this is to be used after we have all the components in the frame otherwise it will crete problems , it is used so that whatever is in the frame will become the size of the frame it will fit it to the size

        

    }
}
