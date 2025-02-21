import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    Gui(){
        // Create JFrame (window)
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Create UI Components
        JTextField textField = new JTextField(20);
        JButton addButton = new JButton("Add");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);

        // Button ActionListener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText().trim();
                if (!text.isEmpty()) {
                    listModel.addElement(text); // Add text to list
                    textField.setText(""); // Clear text field
                }
            }
        });

        // Add components to frame
        frame.add(textField);
        frame.add(addButton);
        frame.add(new JScrollPane(list)); // Scrollable list

        // Show the frame
        frame.setVisible(true);
    }

}
