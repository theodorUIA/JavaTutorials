import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    MyFrame() {
        this.setTitle("MyEventsUiA");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1500, 1500);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
