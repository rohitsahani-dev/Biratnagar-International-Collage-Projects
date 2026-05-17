import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo() {
        setTitle("BorderLayout Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel north = new JPanel(); north.setBackground(Color.RED); north.add(new JLabel("North"));
        JPanel south = new JPanel(); south.setBackground(Color.GREEN); south.add(new JLabel("South"));
        JPanel east = new JPanel(); east.setBackground(Color.YELLOW); east.add(new JLabel("East"));
        JPanel west = new JPanel(); west.setBackground(Color.ORANGE); west.add(new JLabel("West"));
        JPanel center = new JPanel(); center.setBackground(Color.CYAN); center.add(new JLabel("Center"));

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) { new BorderLayoutDemo(); }
}
