import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class flowlayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("ONe"));
        panel.add(new JButton("TWO"));
        panel.add(new JButton("THREE"));
        panel.add(new JButton("FOnnnnnnnnnnnnnnnnnUR"));
        panel.add(new JButton("FIVE"));
        panel.add(new JButton("SIX"));
        panel.add(new JButton("SEVEN"));
        panel.add(new JButton("EIGHT"));
        panel.add(new JButton("NINE"));
        frame.add(panel);
        frame.setVisible(true);
    }
}
