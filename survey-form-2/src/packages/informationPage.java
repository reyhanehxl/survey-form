package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Creat an object of the Font class
        Font CustomFont = new Font("Arial",Font.BOLD,15);
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(null);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.yellow);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(CustomFont);

        nameLabel.setBounds(10, 10, 100, 20);
        JTextField nameField = new JTextField(15);
        nameField.setBounds(50, 10, 100, 20);
        nameLabel.setHorizontalTextPosition(JLabel.CENTER);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(CustomFont);

        ageLabel.setBounds(10, 50, 100, 20);
        JTextField ageField = new JTextField(15);
        ageField.setBounds(50, 50, 100, 20);
        ageLabel.setHorizontalTextPosition(JLabel.CENTER);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(CustomFont);

        emailLabel.setBounds(10, 90, 100, 20);
        JTextField emailField = new JTextField(15);
        emailField.setBounds(50, 90, 100, 20);
        emailLabel.setHorizontalTextPosition(JLabel.CENTER);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("Level of familiarity with similar software");
        levelLabel.setFont(CustomFont);
        levelLabel.setBounds(10, 130, 250, 20);
        levelLabel.setHorizontalTextPosition(JLabel.CENTER);

        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setFont(CustomFont);
        level1.setBounds(10, 160, 100, 20);
        level1.setHorizontalTextPosition(SwingConstants.LEADING);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(CustomFont);
        level2.setBounds(100, 160, 100, 20);
        level2.setHorizontalTextPosition(SwingConstants.LEADING);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(CustomFont);
        level3.setBounds(190, 160, 100, 20);
        level3.setHorizontalTextPosition(SwingConstants.LEADING);
        JRadioButton level4 = new JRadioButton("No Familiarity");
        level4.setFont(CustomFont);
        level4.setBounds(280, 160, 150, 20);
        level4.setHorizontalTextPosition(SwingConstants.LEADING);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next Page");
        nextButton.setFont(CustomFont);
        nextButton.setBounds(10, 200, 100, 20);
        nextButton.setHorizontalAlignment(SwingConstants.CENTER);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
