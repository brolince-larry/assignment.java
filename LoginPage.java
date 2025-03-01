import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("login");
    JButton resetButton = new JButton("reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("user ID:");
    JLabel userPasswordLabel = new JLabel("user password:");
    JLabel messageLabel = new JLabel("THIS IS A TEXT MESSAGE");
    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> logininfoOriginal) {
        logininfo = logininfoOriginal;

        userIDLabel.setBounds(50, 150, 75, 25);
        userPasswordLabel.setBounds(50, 100, 75, 25);
        userIdField.setBounds(125, 150, 200, 25);
        userPasswordField.setBounds(125, 100, 200, 25);
        loginButton.setBounds(50, 200, 100, 25);
        loginButton.setFocusable(false);
        resetButton.setBounds(200, 200, 100, 25);
        resetButton.setFocusable(false);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userIdField);
        frame.add(userPasswordLabel);
       
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(460, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login successful");
                    frame.dispose();

                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            } else {
                messageLabel.setForeground(Color.orange);
                messageLabel.setText("User not found");
            }
        }

        if (e.getSource() == resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> logininfo = new HashMap<String, String>();
        logininfo.put("admin", "admin123");
        logininfo.put("bro", "pizza");
        logininfo.put("brolince", "13608");
        logininfo.put("brocode", "abc123");
        new LoginPage(logininfo);
    }
}
