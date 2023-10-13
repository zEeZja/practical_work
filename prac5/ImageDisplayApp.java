package prac5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplayApp {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> createAndShowImageFrame(imagePath));
    }

    private static void createAndShowImageFrame(String imagePath) {
        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            frame.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
        }

        frame.setVisible(true);
    }
}
