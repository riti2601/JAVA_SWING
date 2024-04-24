import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class gridLayout {
    // layout manager = defines natural layout for components within a container
    // grid layout = places components ina grid of cells
    //               each component take all the available space within the cell
    //               and each cell is the ame size 

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10));

        JButton button1 = new JButton("one");
        JButton button2 = new JButton("two");
        JButton button3 = new JButton("three");
        JButton button4 = new JButton("four");
        JButton button5 = new JButton("five");
        JButton button6 = new JButton("six");
        JButton button7 = new JButton("seven");
        JButton button8 = new JButton("eight");
        JButton button9 = new JButton("nine");
        JButton button10 = new JButton("ten");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.setVisible(true);
    }
}
