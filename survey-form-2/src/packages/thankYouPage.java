package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        // Creat an object of the Font class
        Font CustomFont = new Font("Arial",Font.BOLD,24);
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.YELLOW);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your participation!");
        thankYouLabel.setFont(CustomFont);
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
