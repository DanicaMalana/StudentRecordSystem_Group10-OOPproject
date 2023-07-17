import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherHomePage extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public TeacherHomePage() {
        setTitle("Student Record System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Course, Year and Section");
        tableModel.addColumn("Contact no.");
        tableModel.addColumn("Address");
        tableModel.addColumn("Birthday");
        tableModel.addColumn("Student No.");
        tableModel.addColumn("Attendance");
        tableModel.addColumn("Grade in 1st Sem");
        tableModel.addColumn("Grade in 2nd Sem");

        tableModel.addRow(new Object[]{"Jaspher Baet", 20, "BSIT2-1", "0948-071-1150", "Malaban Ilaya street Zone 5 Biñan Laguna", "10/09/2002", "2021-00404-BN-0", "05/31/2023 - Present", "1.00", "1.25"});
        tableModel.addRow(new Object[]{"Danica Malana", 20, "BSIT2-1", "0945-823-1439", "878, Purok 7 Gulod Cabuyao Laguna", "02/02/2003", "2021-00346-BN-0", "05/31/2023 - Present", "1.00", "1.25"});
        tableModel.addRow(new Object[]{"Justine Irish Diolata", 20, "BSIT2-1", "0912-880-3234", "Purok 3 Blk 3 Lot 10 Jonelta Housing Sto. Niño Biñan Laguna", "05/04/2003", "2021-00059-BN-0", "05/31/2023 - Present", "1.00", "1.25"});
        tableModel.addRow(new Object[]{"Patricia Sison", 21, "BSIT2-1", "093-9725-3256", "2896 Sta. Teresita St. Almeda Subd. Dela Paz Biñan Laguna", "08/14/2001", "2021-00061-BN-0", "05/31/2023 - Present", "1.00", "1.25"});
        tableModel.addRow(new Object[]{"John Christopher Remolacio", 20, "BSIT2-1", "0910-860-0093", "354 SACATERO ST. CANLALAY BINAN CITY LAGUNA", "11/17/2002", "2021-00414-BN-0", "05/31/2023 - Present", "1.00", "1.25"});


        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt the user for input
                String name = JOptionPane.showInputDialog("Enter Name:");
                String age = JOptionPane.showInputDialog("Enter Age: ");
                String course = JOptionPane.showInputDialog("Enter Course, Year and Section:");
                String contactno = JOptionPane.showInputDialog("Enter Contact no. :");
                String address = JOptionPane.showInputDialog("Enter Address:");
                String bday = JOptionPane.showInputDialog("Enter Date of Birthday:");
                String studentno = JOptionPane.showInputDialog("Enter Student no. :");
                String attendance = JOptionPane.showInputDialog("Enter Attendance:");
                String grade1 = JOptionPane.showInputDialog("Enter Grade in 1st Sem:");
                String grades2 = JOptionPane.showInputDialog("Enter Grade in 2nd Sem:");

                // Add the data to the table
                tableModel.addRow(new Object[]{name, age, course, contactno, address, bday, studentno, attendance, grade1, grades2});
            }
        });
        buttonPanel.add(addButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected row index
                int selectedRow = table.getSelectedRow();

                if (selectedRow != -1) {
                    // Remove the selected row from the table
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row to delete.");
                }
            }
        });
        buttonPanel.add(deleteButton);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected row index
                int selectedRow = table.getSelectedRow();

                if (selectedRow != -1) {
                    // Prompt the user for input
                    String name = JOptionPane.showInputDialog("Enter Name:");
                    String age = JOptionPane.showInputDialog("Enter Age: ");
                    String course = JOptionPane.showInputDialog("Enter Course, Year and Section:");
                    String contactno = JOptionPane.showInputDialog("Enter Contact no. :");
                    String address = JOptionPane.showInputDialog("Enter Address:");
                    String bday = JOptionPane.showInputDialog("Enter Date of Birthday:");
                    String studentno = JOptionPane.showInputDialog("Enter Student no. :");
                    String attendance = JOptionPane.showInputDialog("Enter Attendance:");
                    String grade1 = JOptionPane.showInputDialog("Enter Grade in 1st Sem:");
                    String grades2 = JOptionPane.showInputDialog("Enter Grade in 2nd Sem:");

                    // Update the selected row with the new data
                    tableModel.setValueAt(name, selectedRow, 0);
                    tableModel.setValueAt(age, selectedRow, 1);
                    tableModel.setValueAt(course, selectedRow, 2);
                    tableModel.setValueAt(contactno, selectedRow, 3);
                    tableModel.setValueAt(address, selectedRow, 4);
                    tableModel.setValueAt(bday, selectedRow, 5);
                    tableModel.setValueAt(studentno, selectedRow, 6);
                    tableModel.setValueAt(attendance, selectedRow, 7);
                    tableModel.setValueAt(grade1, selectedRow, 8);
                    tableModel.setValueAt(grades2, selectedRow, 9);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row to update.");
                }
            }
        });
        buttonPanel.add(updateButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TeacherHomePage().setVisible(true);
            }
        });
    }
}
