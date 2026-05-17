import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class UserInputFrame extends JFrame {
    JTextField tfFirst, tfLast, tfAddress, tfContact, tfSemester;
    JButton btnSubmit;

    public UserInputFrame() {
        setTitle("User Input");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("First Name:")); tfFirst = new JTextField(); add(tfFirst);
        add(new JLabel("Last Name:")); tfLast = new JTextField(); add(tfLast);
        add(new JLabel("Address:")); tfAddress = new JTextField(); add(tfAddress);
        add(new JLabel("Contact:")); tfContact = new JTextField(); add(tfContact);
        add(new JLabel("Semester:")); tfSemester = new JTextField(); add(tfSemester);

        btnSubmit = new JButton("Save to CSV"); add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try (FileWriter writer = new FileWriter("data.csv", true)) {
                    writer.write(tfFirst.getText() + "," + tfLast.getText() + "," +
                                 tfAddress.getText() + "," + tfContact.getText() + "," +
                                 tfSemester.getText() + "\n");
                    JOptionPane.showMessageDialog(null, "Saved!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error writing file.");
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) { new UserInputFrame(); }
}

