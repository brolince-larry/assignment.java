import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// LoginPage class implements ActionListener to handle button actions
public class LoginPage implements ActionListener {
    // Creating GUI components
    JFrame frame = new JFrame(); // Main application frame
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField(); // Input field for user ID
    JPasswordField userPasswordField = new JPasswordField(); // Input field for password
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel(); // Label to display login status messages
    HashMap<String, String> logininfo = new HashMap<>(); // Stores user credentials

    // Constructor to initialize the login page
    LoginPage(HashMap<String, String> logininfoOriginal) {
        logininfo = logininfoOriginal;

        // Setting positions and dimensions of components
        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);
        loginButton.setBounds(50, 200, 100, 25);
        loginButton.setFocusable(false);
        resetButton.setBounds(200, 200, 100, 25);
        resetButton.setFocusable(false);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 18));

        // Adding action listeners to buttons
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Adding components to the frame
        frame.add(userIDLabel);
        frame.add(userIdField);
        frame.add(userPasswordLabel);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        // Setting frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handling login button click
        if (e.getSource() == loginButton) {
            String userID = userIdField.getText(); // Retrieve entered username
            String password = String.valueOf(userPasswordField.getPassword()); // Retrieve entered password

            if (logininfo.containsKey(userID)) { // Check if user exists
                if (logininfo.get(userID).equals(password)) { // Check if password is correct
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful!");
                    frame.dispose(); // Close login window

                    WelcomePage welcomePage = new WelcomePage(userID); // Open welcome page
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong Password!");
                }
            } else {
                messageLabel.setForeground(Color.ORANGE);
                messageLabel.setText("User Not Found!");
            }
        }

        // Handling reset button click
        if (e.getSource() == resetButton) {
            userIdField.setText(""); // Clear username field
            userPasswordField.setText(""); // Clear password field
            messageLabel.setText(""); // Clear message label
        }
    }

    public static void main(String[] args) {
        // Creating user credentials
        HashMap<String, String> logininfo = new HashMap<>();
        logininfo.put("admin", "admin123");
        logininfo.put("user1", "password1");
        logininfo.put("guest", "guest123");

        // Launching the login page
        new LoginPage(logininfo);
    }
}
