import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends JFrame {
    CardLayout cardLayout;
    JPanel mainPanel;

    public CardLayoutDemo() {
        setTitle("CardLayout Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel(); card1.add(new JLabel("Panel 1 Content"));
        JPanel card2 = new JPanel(); card2.add(new JLabel("Panel 2 Content"));

        mainPanel.add(card1, "1");
        mainPanel.add(card2, "2");

        JButton toggleButton = new JButton("Next Card");
        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(mainPanel);
            }
        });

        add(mainPanel, BorderLayout.CENTER);
        add(toggleButton, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args) { new CardLayoutDemo(); }
}
