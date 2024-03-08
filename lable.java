package JAVA_SWING;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//lable is gui compenent a display are for text, image
public class lable {
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("image.png");
        
        
        JLabel lable = new JLabel(); // creates a lable
        lable.setText("Do you even code??"); // set text of lable 
        lable.setIcon(icon);
        lable.setHorizontalTextPosition(JLabel.CENTER);// left, center, right of imageicon
        lable.setVerticalTextPosition(JLabel.TOP);// top, center, bottom of imageicon

        lable.setForeground(new Color(100,50,0)); // change color of the text ie font color 
        lable.setFont(new Font("MV Boli", Font.PLAIN,20));//set font of the text, its size and italic thingie
        lable.setIconTextGap(25); // set gap of text to image
        lable.setBackground(Color.BLACK); 
        lable.setOpaque(true);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("lets code");
        frame.add(lable);
        

        

    }
}
