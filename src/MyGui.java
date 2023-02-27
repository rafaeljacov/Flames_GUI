import javax.swing.*;
import java.awt.*;

public class MyGui extends JFrame{
    MyGui() {
        this.setSize(750,750);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flames Candle");
        this.add(new Header(), BorderLayout.NORTH);
        this.add(new MainPanel(),BorderLayout.CENTER);
        this.setVisible(true);
    }
}
