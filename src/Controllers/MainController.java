package Controllers;

import Files.MapFile;
import Models.Map;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JFrame;

public class MainController{

    public static void main(String[] args) throws IOException {
        
        final int screenWidth = 800;
        final int screenHeight = 600;
        
        MapFile mapFile = new MapFile(new File("map.bin"));
       
        JFrame window = new JFrame();        
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(screenWidth, screenHeight);
        window.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - screenWidth)/2, (Toolkit.getDefaultToolkit().getScreenSize().height - screenHeight)/2);
        window.setResizable(false);

        window.setContentPane(new Map(mapFile));
        window.setVisible(true);
     
    }

}
