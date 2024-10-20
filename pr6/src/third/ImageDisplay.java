package third;

import javax.swing.*;

public class ImageDisplay extends JFrame {

    public ImageDisplay(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);

        add(label);
    }

    public static void main(String[] args) {

        String imagePath = "/Users/Артем/Downloads.photopr.jpg";

        SwingUtilities.invokeLater(() -> {
            ImageDisplay frame = new ImageDisplay(imagePath);
            frame.setVisible(true);
        });
    }
}
