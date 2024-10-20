package fourth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AnimatedImage extends JFrame {
    private JLabel imageLabel;
    private ImageIcon[] frames;
    private int currentFrame = 0;

    public AnimatedImage() {
        setTitle("Animated Image");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        frames = new ImageIcon[10];

        frames[0] = new ImageIcon("/Users/user/Downloads/ph1.jpg");
        frames[1] = new ImageIcon("/Users/user/Downloads/ph2.jpg");
        frames[2] = new ImageIcon("/Users/user/Downloads/ph3.jpg");
        frames[3] = new ImageIcon("/Users/user/Downloads/ph4.jpg");
        frames[4] = new ImageIcon("/Users/user/Downloads/ph5.jpg");
        frames[5] = new ImageIcon("/Users/user/Downloads/ph6.jpg");
        frames[6] = new ImageIcon("/Users/user/Downloads/ph7.jpg");
        frames[7] = new ImageIcon("/Users/user/Downloads/ph8.jpg");
        frames[8] = new ImageIcon("/Users/user/Downloads/ph9.jpg");
        frames[9] = new ImageIcon("/Users/user/Downloads/ph10.jpg");

        for (ImageIcon frame : frames) {
            if (frame.getIconWidth() == -1) {
                System.err.println("Image not found: " + frame.getDescription());
            }
        }

        imageLabel = new JLabel(frames[currentFrame]);
        add(imageLabel);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                imageLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimatedImage frame = new AnimatedImage();
            frame.setVisible(true);
        });
    }
}