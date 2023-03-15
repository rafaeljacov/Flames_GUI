import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Logic implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == MainPanel.confirm) {
            if (!checkErrors()) {
                String[] userChars = MainPanel.name1.getText().split("");
                String[] flameChars = MainPanel.name2.getText().split("");

                ArrayList<String> candle = new ArrayList<>();

                compareNames(MainPanel.name1.getText(), flameChars,candle);
                compareNames(MainPanel.name2.getText(), userChars,candle);

                int flameCounter = candle.size();
                while (flameCounter > 5) flameCounter-=5;

                new Flames(flameCounter);
            }
        }
        else if (e.getSource() == MainPanel.resetName1) MainPanel.name1.setText(null);
        else if (e.getSource() == MainPanel.resetName2) MainPanel.name2.setText(null);

    }


    public static String flamesCandle(int counter){
        return switch (counter){
            case 2 -> "\"Lovers (♥ω♥*)\"";
            case 3 -> "\"Affection (♥ω♥*)\"";
            case 4 -> "\"Marriage (✿ ♥‿♥)\"";
            case 5 -> "\"Enemies (•ˋ _ ˊ•)\"";
            default -> "\"Friendship ( • ‿ • )\"";
        };
    }

    private boolean entryIsEmpty(String name) {
        if (name.length() == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cannot provide an empty name entry!",
                    "WARNING!",
                    JOptionPane.WARNING_MESSAGE);

            return true;
        }
        return false;
    }

    private boolean nameIsNotValid(String name) {
        if (!name.matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Name must not contain non-alphabetic character!",
                    "WARNING!",
                    JOptionPane.WARNING_MESSAGE);

            return true;
        }
        return false;
    }

    private void compareNames(String name, String[] nameChars, ArrayList<String> candle){
        for (String s: nameChars){
            if (!name.contains(s.toLowerCase())) {
                candle.add(s);
            }
        }
    }

    private boolean checkErrors() {
        if (entryIsEmpty(MainPanel.name1.getText()) || entryIsEmpty(MainPanel.name2.getText())) return true;

        return nameIsNotValid(MainPanel.name1.getText()) || nameIsNotValid(MainPanel.name2.getText());
    }
}
