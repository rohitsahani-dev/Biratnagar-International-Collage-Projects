import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class CSVToTable extends JFrame {
    public CSVToTable() {
        setTitle("CSV to JTable");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] headers = {"FIRST_NAME", "LAST_NAME", "ADDRESS", "CONTACT_NUMBER", "SEMESTER"};
        DefaultTableModel model = new DefaultTableModel(headers, 0);
        JTable table = new JTable(model);

        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            br.readLine(); // Skip header row
            while ((line = br.readLine()) != null) {
                model.addRow(line.split(","));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Make sure 'data.csv' exists.");
        }

        add(new JScrollPane(table));
        setVisible(true);
    }
    public static void main(String[] args) { new CSVToTable(); }
}
