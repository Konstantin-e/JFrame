package frame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel {
  MyLabel() {
    ImageIcon image = new ImageIcon("img/icon.png");
    //Border border = BorderFactory.createLineBorder(Color.green, 3);

    this.setText("Label text....");
    this.setIcon(image);
    this.setHorizontalTextPosition(JLabel.CENTER);
    this.setVerticalTextPosition(JLabel.TOP);
    this.setForeground(new Color(0x00FF00));
    this.setBackground(Color.black);
    this.setOpaque(true);
    //this.setBorder(border);
    this.setVerticalAlignment(JLabel.CENTER);
    this.setHorizontalAlignment(JLabel.CENTER);
     
  }
}
