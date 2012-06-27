package Controllers;

import Files.MapFile;
import Models.Map;
import java.awt.Color;
import java.io.*;
import javax.swing.JFrame;

public class MainController{

    public static void main(String[] args) throws IOException {
        
        MapFile mapFile = new MapFile(new File("map.bin"));
       
        JFrame window = new JFrame();        
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(480, 360);
        window.setResizable(true);
        window.setBackground(Color.CYAN);
        window.setContentPane(new Map(mapFile));
        window.setVisible(true);
     
       
    }

}
