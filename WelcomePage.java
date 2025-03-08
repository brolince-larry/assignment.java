import java.awt.Font; // Importing Font class for setting text font
import javax.swing.JFrame; // Importing JFrame for GUI window
import javax.swing.JLabel; // Importing JLabel for displaying text

public class WelcomePage {
    // Creating a JFrame (window) instance
    JFrame frame = new JFrame("Welcome"); 
    
    // Creating a JLabel (text label) instance
    JLabel welcomeLabel = new JLabel();  

    // Constructor accepting userID to personalize the welcome message
    public WelcomePage(String userID) {
        
        // Setting label text with user ID
        welcomeLabel.setText("Hello " + userID);
        
        // Setting label position and size (X, Y, Width, Height)
        welcomeLabel.setBounds(100, 150, 220, 35); // Adjusted for better positioning
        
        // Setting font for label text
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 25));

        // Adding label to the frame (window)
        frame.add(welcomeLabel);
        
        // Setting default close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setting frame size (Width, Height)
        frame.setSize(420, 420);
        
        // Setting layout to null 
        frame.setLayout(null);
        
        // Centering the frame on the screen
        frame.setLocationRelativeTo(null); 
        
        // Making the frame visible
        frame.setVisible(true);
    }
}
