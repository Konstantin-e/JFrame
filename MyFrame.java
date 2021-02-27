package frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {

  MyFrame() {
    this.setTitle("My_JFrame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setResizable(false);
    this.setSize(420, 420);
    this.setVisible(true);

    ImageIcon image = new ImageIcon("img/icon.png");
    //this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(255, 255, 255));
  }

}
