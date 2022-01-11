import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
public class Main {

    public static void main(String[] args) {

        ImageIcon uialogo = new ImageIcon("logo.png");


        JLabel label = new JLabel();
        label.setText("Velkommen til");
        label.setIcon(uialogo);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x123456));
        label.setIconTextGap(20);
        label.setFont(new Font("Verdana", Font.PLAIN, 25));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,800,500);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MyEventsUiA");
        frame.setResizable(false);
        frame.setSize(800, 500);
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label);

    }

}