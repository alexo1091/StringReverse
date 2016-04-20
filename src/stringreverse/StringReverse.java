package stringreverse;

import javax.swing.*;

/**
 * Created by Mi³osz on 2016-04-20.
 */
public class StringReverse {
    private String text;

    public StringReverse(){
        readText();
        reverse();
    }

    private void readText(){
        text = JOptionPane.showInputDialog(null, "Podaj stringa do odwrócenia", "Wpisz tekst");
    }

    private void reverse(){
        char[] table = text.toCharArray();
        for(int i = 0; i < (table.length / 2); i++){
            char tmp = table[i];
            table[i] = table[table.length-1-i];
            table[table.length-1-i] = tmp;
        }

        text = String.valueOf(table);
    }

    public String getText() {
        return text;
    }
}
