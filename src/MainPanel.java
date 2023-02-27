import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;

public class MainPanel extends JPanel{
    static JTextField name1;
    static JButton resetName1;
    static JTextField name2;
    static JButton resetName2;
    static JButton confirm;
    MainPanel(){
        this.setLayout(null);
        this.setBackground(new Color(255, 247, 251));

        JLabel nameLabel1 = new JLabel("Enter Your Name Below");
        nameLabel1.setFont(new Font("Noto Serif", Font.BOLD,30));
        nameLabel1.setForeground(new Color(171, 3, 78));
        nameLabel1.setBounds(200, 70, 400, 30);

        name1 = new JTextField();
        name1.setBounds(70, 120, 530,70);
        name1.setCaretColor(new Color(250, 22, 121));
        name1.setFont(new Font("Noto Serif", Font.ITALIC,30));
        name1.setBackground(new Color(252, 235, 244));
        name1.setForeground(new Color(171, 3, 78));

        resetName1 = new JButton("X");
        resetName1.addActionListener(new Logic());
        resetName1.setBounds(610,120, 70,70);
        resetName1.setBackground(new Color(250, 22, 121));
        resetName1.setFont(new Font(null, Font.PLAIN,35));
        resetName1.setForeground(Color.white);
        resetName1.setFocusable(false);


        JLabel nameLabel2 = new JLabel("Enter Your Flame's Name Below");
        nameLabel2.setFont(new Font("Noto Serif", Font.BOLD,26));
        nameLabel2.setForeground(new Color(171, 3, 78));
        nameLabel2.setBounds(175, 220, 600, 30);

        name2 = new JTextField();
        name2.setBounds(70, 270, 530,70);
        name2.setCaretColor(new Color(250, 22, 121));
        name2.setFont(new Font("Noto Serif", Font.ITALIC,30));
        name2.setBackground(new Color(252, 235, 244));
        name2.setForeground(new Color(171, 3, 78));


        resetName2 = new JButton("X");
        resetName2.addActionListener(new Logic());
        resetName2.setBounds(610,270, 70,70);
        resetName2.setBackground(new Color(250, 22, 121));
        resetName2.setFont(new Font(null, Font.PLAIN,35));
        resetName2.setForeground(Color.white);
        resetName2.setFocusable(false);

        confirm = new JButton("Flames");
        confirm.addActionListener(new Logic());
        confirm.setBounds(220,400,300,100);
        confirm.setBackground(new Color(250, 22, 121));
        confirm.setFont(new Font("Noto Serif", Font.PLAIN,35));
        confirm.setForeground(Color.white);
        confirm.setFocusable(false);


        this.add(nameLabel1);
        this.add(name1);
        this.add(resetName1);

        this.add(nameLabel2);
        this.add(name2);
        this.add(resetName2);

        this.add(confirm);
    }
}
