package stringreverse;

import javax.swing.*;

/**
 * Created by Mi�osz on 2016-04-20.
 */
public class Main {
    public static void main(String[] args) {
        StringReverse rev = new StringReverse();
        JOptionPane.showMessageDialog(null, rev.getText(),"Odwr�cony string", JOptionPane.INFORMATION_MESSAGE);
    }
}
