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
        label.setFont(new Font("MV Boli", Font.PLAIN,20));//set font of the text, its size and italic thingie
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(Color.BLACK); 
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER);

        label.setBorder(border);// added border to the label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("lets code");
        frame.add(label);
        

        

    }
}
