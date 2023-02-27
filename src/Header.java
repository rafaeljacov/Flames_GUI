import javax.swing.*;
import java.awt.*;

public class Header extends JPanel{

    Header(){
        this.setPreferredSize(new Dimension(100,130));
        this.setBackground(new Color(250, 22, 121));
        this.setLayout(null);

        JLabel headerLabel = new JLabel("~ Flames Candle ~");

        headerLabel.setBounds(200,25,430,70);
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Noto Serif", Font.ITALIC,40));

        this.add(headerLabel);
    }
}
