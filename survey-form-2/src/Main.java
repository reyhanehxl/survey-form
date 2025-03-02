import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main{

    public static void main(String[] args) {
        // Creat an object of the Font class
        Font CustomFont = new Font("Arial",Font.BOLD,15);
        // Create and configure the main frame
        JFrame frame = new JFrame("Survey Form");
        frame.setFont(CustomFont);

        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.YELLOW);


        // Create title label
        JLabel title = new JLabel("Survey Form");
        title.setFont(CustomFont);
        title.setBounds(10, 10, 100, 20);
        title.setHorizontalTextPosition(JLabel.CENTER);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(CustomFont);
        startButton.setHorizontalAlignment(SwingConstants.CENTER);

        startButton.setBounds(40, 40, 100, 20);

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
