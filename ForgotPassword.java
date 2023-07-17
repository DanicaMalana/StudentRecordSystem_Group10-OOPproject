import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ForgotPassword {
    private Map<String, String> userPasswords = new HashMap<>();
    private JTextField usernameField;
    private JTextField newPasswordField;
    private JButton resetButton;
    private JButton confirmButton;
    private JButton forgotPasswordButton;
    private JFrame frame;

    public ForgotPassword() {
        userPasswords.put("jc", "jc123");
        userPasswords.put("jaspher", "jaspher456");
        userPasswords.put("danica", "danica789");
        userPasswords.put("patricia", "patricia101112");
        userPasswords.put("irish", "irish131415");

        frame = new JFrame("Forgot Password For Students");

        forgotPasswordButton = new JButton("Forgot Password");
        forgotPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showForgotPasswordDialog();
            }
        });

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(forgotPasswordButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void showForgotPasswordDialog() {
        frame.getContentPane().removeAll();

        usernameField = new JTextField(20);
        usernameField.setToolTipText("Enter your username");
        frame.getContentPane().add(usernameField);

        newPasswordField = new JTextField(20);
        newPasswordField.setToolTipText("Enter your new password");
        frame.getContentPane().add(newPasswordField);

        resetButton = new JButton("Reset Password");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetPassword();
            }
        });
        frame.getContentPane().add(resetButton);

        confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newPassword();
            }
        });
        confirmButton.setEnabled(false);
        frame.getContentPane().add(confirmButton);

        frame.revalidate();
        frame.repaint();
    }

    private void resetPassword() {
        String username = usernameField.getText();
        String newPassword = newPasswordField.getText();

        if (userPasswords.containsKey(username)) {
            userPasswords.put(username, newPassword);
            showMessage("Password Reset", "Password has been successfully reset!");
            resetButton.setEnabled(false);
            confirmButton.setEnabled(true);
        } else {
            showMessage("Invalid Username", "Username not found!");
        }

        usernameField.setText("Username:");
        newPasswordField.setText("Enter your new password:");
    }

    private void newPassword() {
        showMessage("New Password Confirmed", "New password has been confirmed!");
        resetButton.setEnabled(true);
        confirmButton.setEnabled(false);
    }

    private void showMessage(String title, String message) {
        JOptionPane.showMessageDialog(frame, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword();
            }
        });
    }
}
