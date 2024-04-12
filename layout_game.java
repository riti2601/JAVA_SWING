    //package JAVA_SWING;

    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Random;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;


    public class layout_game extends JFrame implements ActionListener{

        static JButton yes;
        static JButton no;
        static JButton proceed;
        static JPanel panel5; 
        static JPanel panel6;
        static JFrame frame;
        static JButton one;
        static JButton two;
        static String enemies;

        layout_game(JFrame frame){
        this.frame = frame;
        enemies = " ";
        //button for yes
        yes = new JButton();
        yes.setBounds(0,0,60,500);
        yes.setText("<html><h2>YES</h2></html>");
        yes.setFocusable(false);
        yes.setBackground( new Color(0,100,30));
        yes.addActionListener(this);

        //button for no
        no = new JButton();
        no.setBounds(0,0,60,500);
        no.setText("<html><h2>NO</h2></html>");
        no.setFocusable(false);
        no.setBackground( new Color(100,0,30));
        no.addActionListener(this);

        //button for 1
        one = new JButton();
        one.setBounds(0,0,60,500);
        one.setText("<html><h2>1</h2></html>");
        one.setFocusable(false);
        one.setBackground( new Color(0,100,30));
        one.addActionListener(this);
        one.setVisible(false);

        //button for 2
        two = new JButton();
        two.setBounds(0,0,60,500);
        two.setText("<html><h2>2</h2></html>");
        two.setFocusable(false);
        two.setBackground( new Color(100,0,30));
        two.addActionListener(this);
        two.setVisible(false);


        proceed = new JButton();
        proceed.setFocusable(false);
        proceed.setText("<html><h2>PROCEED TO THE DUNGEON</h2><h3>LETS START THE ADVENTURE!<br/>I hope the odds are in your favour fighter!<h3></html>");
        proceed.setVisible(false);
        proceed.setBackground(Color.DARK_GRAY);
        proceed.setForeground(Color.WHITE);
        proceed.addActionListener(this);


        this.add(yes);
        this.add(no);
        this.add(proceed);
        this.add(one);
        }

        public static void main(String[] args) {

        //frame creation
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(new BorderLayout(5,5));
        frame.setVisible(true);

        //panels at the north, south, east, west, center resp
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();

        //label for header, footer, center
        JLabel label1 = new JLabel("<html><h1>DUNGEON AWAITS</h1></html>");
        label1.setForeground(new Color(150,10,30));
        JLabel label2 = new JLabel("<html><h2>CREATED BY: RITISHA PANDE</h2></html>");
        label2.setForeground(Color.BLACK);
        JLabel label5 = new JLabel("<html><h1>WELCOME TO THE DUNGEON!</h1><br><h2>DO YOU WANT TO ENTER THE DUNGEON?<br>Click on the either side of the screen.</h2></html>");
        JLabel label3 = new JLabel("<html><h1>YOU HAVE ENTERED THE DUNGEON!</h1><br>"+enemies+"<h1>has appeared.</h1><br><h2>What would you like to do?<br>1. ATTACK 2.RUN <br>Click on the either side of the screen.</h2></html>");
        label3.setForeground(Color.WHITE);
        

        //colors to panels
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.DARK_GRAY);
        panel5.setBackground(Color.LIGHT_GRAY);
        panel6.setBackground(Color.BLACK);

        //size of panels 
        panel1.setPreferredSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(50,50));
        panel3.setPreferredSize(new Dimension(60,100));
        panel4.setPreferredSize(new Dimension(60,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(100,100));

        new layout_game(frame);
        //adding components to panel
        panel3.setLayout(new BorderLayout());
        panel4.setLayout(new BorderLayout());
        panel5.setLayout(new BorderLayout());
        panel6.setLayout(new BorderLayout());
        panel4.add(yes);
        panel3.add(no);
        panel4.add(one);
        panel3.add(two);
        panel5.add(proceed, BorderLayout.SOUTH);
        panel1.add(label1);
        panel2.add(label2);
        panel5.add(label5, BorderLayout.NORTH);
        panel6.add(label3);


        //adding panels to frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);
        
        panel6.setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==yes){
                System.out.println("YES");
                proceed.setVisible(true);
            }
            else if(e.getSource()==no){
                System.out.println("NO");
            }
            else if(e.getSource()==proceed){
                proceed.setEnabled(false);
                System.out.println("proceed");
                panel5.setVisible(false);
                frame.add(panel6, BorderLayout.CENTER);
                panel6.setVisible(true);
                yes.setVisible(false);
                no.setVisible(false);
                one.setVisible(true);
                two.setVisible(true);
                Random rand = new Random();
                //game variables
                String[] enemiesArray = new String[] {"Skeleton", "Zombie", "Warrior", "Assassin", "Knight", "Vampire"};
                int maxEnemyHealth = 80;
                int enemyAttackDamage = 25;

                //player variables
                int health = 100;
                int attackDamage = 30;
                int numHealthPots = 3;
                int healthPotionHealAmt = 30;
                int healthPotionDropChance = 50; //percentage of having chance of having potion

                
                //int enemyHealth = rand.nextInt(maxEnemyHealth);
                //enemies = enemies[rand.nextInt(enemies.length())];
                int enemyIndex = rand.nextInt(enemiesArray.length);
                enemies = enemiesArray[enemyIndex];


                
            }
            else if(e.getSource()==one){
                System.out.println("We attack");
            }
        }
        
        
        
    }
