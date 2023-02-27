import javax.swing.*;
import java.awt.*;

public class Flames extends JFrame{
    static JFrame frame;
    JPanel flamePanel;
    Flames(int flameCounter) {
        JLabel flameLabel = new JLabel("~ Flames Candle... ~");
        flameLabel.setFont(new Font("Noto Serif", Font.ITALIC,50));
        flameLabel.setPreferredSize(new Dimension(500,100));
        flameLabel.setHorizontalAlignment(JLabel.CENTER);
        flameLabel.setForeground(Color.white);

        JLabel flameResult = new JLabel();
        flameResult.setText(Logic.flamesCandle(flameCounter));
        flameResult.setFont(new Font("Noto Serif", Font.ITALIC,60));
        flameResult.setPreferredSize(new Dimension(700,200));
        flameResult.setHorizontalAlignment(JLabel.CENTER);
        flameResult.setForeground(Color.white);




        flamePanel = new JPanel();
//        flamePanel.setLayout(null);
//        flamePanel.setBounds(0,0,700,500);
        flamePanel.add(flameLabel);
        flamePanel.add(flameResult);
        flamePanel.setBackground(new Color(250, 22, 121));


        frame = new JFrame();
        frame.setSize(700,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Flames Candle");
        frame.add(flamePanel);
        frame.setVisible(true);

    }
}
