/*
* File: IOPanel.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-17
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Az IOPanel egy feliratból és egy szövegdobozból áll.
 * Adatok bekérésére és az eredmények kiiratására is használható.
*/
public class IOPanel extends JPanel {
    JLabel ioLabel;
    public JTextField ioField;
    public IOPanel() {
        this.ioLabel = new JLabel();
        this.ioField = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.addComponents();
    }
    public void setLabelText(String string) {
        this.ioLabel.setText(string);
    }
    public void addComponents() {
        this.add(ioLabel);
        this.add(ioField);
    }
}
