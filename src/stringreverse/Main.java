package stringreverse;

import javax.swing.*;

/**
 * Created by Mi³osz on 2016-04-20.
 */
public class Main {
    public static void main(String[] args) {
        StringReverse rev = new StringReverse();
        JOptionPane.showMessageDialog(null, rev.getText(),"Odwrócony string", JOptionPane.INFORMATION_MESSAGE);
    }
}
