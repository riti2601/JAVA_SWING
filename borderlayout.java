package JAVA_SWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class borderlayout {
    public static void main(String[] args) {
    //border layout = a borderlayout places components in five areas north south east west center ... all extra space is left in the center area
    //layout manager = defines the natural layout for components within a container
    // 3 common managers 

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setVisible(true);
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    JLabel label1 = new JLabel();
    label1.setText("NORTH");
    JLabel label2 = new JLabel();
    label2.setText("SOUTH");
    JLabel label3 = new JLabel();
    label3.setText("EAST");
    JLabel label4 = new JLabel();
    label4.setText("WEST");
    JLabel label5 = new JLabel();
    label5.setText("CENTER");

    panel1.add(label1);
    panel2.add(label2);
    panel3.add(label3);
    panel4.add(label4);
    panel5.add(label5);

    panel1.setBackground(Color.RED);
    panel2.setBackground(Color.YELLOW);
    panel3.setBackground(Color.BLUE);
    panel4.setBackground(Color.GREEN);
    panel5.setBackground(Color.BLACK);
    
    panel1.setPreferredSize(new Dimension(100,50));
    panel2.setPreferredSize(new Dimension(50,50));
    panel3.setPreferredSize(new Dimension(50,100));
    panel4.setPreferredSize(new Dimension(50,100));
    //panel5.setPreferredSize(new Dimension(100,100));


    //---------------------sub panels------------------------------

    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();

    /*JLabel label6 = new JLabel();
    label6.setText("NORTH");
    JLabel label7 = new JLabel();
    label7.setText("SOUTH");
    JLabel label8 = new JLabel();
    label8.setText("EAST");
    JLabel label9 = new JLabel();
    label9.setText("WEST");
    JLabel label10 = new JLabel();
    label10.setText("CENTER");*/

    JLabel label6 = new JLabel("NORTH");
    JLabel label7 = new JLabel("SOUTH");
    JLabel label8 = new JLabel("EAST");
    JLabel label9 = new JLabel("WEST");
    JLabel label10 = new JLabel("CENTER");

    panel6.add(label6);
    panel7.add(label7);
    panel8.add(label8);
    panel9.add(label9);
    panel10.add(label10);

    panel6.setBackground(Color.DARK_GRAY);
    panel7.setBackground(Color.LIGHT_GRAY);
    panel8.setBackground(Color.DARK_GRAY);
    panel9.setBackground(Color.LIGHT_GRAY);
    panel10.setBackground(Color.BLACK);

    panel5.setLayout(new BorderLayout());
    panel5.setPreferredSize(new Dimension(400,400));
    
    panel6.setPreferredSize(new Dimension(50,50));
    panel7.setPreferredSize(new Dimension(50,50));
    panel8.setPreferredSize(new Dimension(50,50));
    panel9.setPreferredSize(new Dimension(50,50));
    panel10.setPreferredSize(new Dimension(50,50));

    panel5.add(panel6, BorderLayout.NORTH);
    panel5.add(panel7, BorderLayout.SOUTH);
    panel5.add(panel8, BorderLayout.EAST);
    panel5.add(panel9, BorderLayout.WEST);
    panel5.add(panel10, BorderLayout.CENTER);

    //------------------------------------------------------------------

    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.SOUTH);
    frame.add(panel3, BorderLayout.EAST);
    frame.add(panel4, BorderLayout.WEST);
    frame.add(panel5, BorderLayout.CENTER);

    

    }
    
    
    
}
