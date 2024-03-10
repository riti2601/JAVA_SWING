package JAVA_SWING;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel {
    // JPanel is a gui component that functions as a container to hold other components
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("image.png");
        
        JLabel label = new JLabel();
        label.setText("HELLO");
        //label.setVerticalAlignment(JLabel.CENTER);//used for border layout not for null layout 
        //label.setHorizontalAlignment(JLabel.CENTER);//used for border layout not for null layout 
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM); 
        label.setBounds( 50,0,200,200);//used in case of null layout
        label.setIcon(icon);


        JPanel  redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(null);
        

        JPanel  bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(null);
        

        JPanel  greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(null); //to set the label in a position f we need to put it in another panel this line of code must be added

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("lets code");
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        
    }
}
