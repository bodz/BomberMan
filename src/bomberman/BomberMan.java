package bomberman;

import java.io.File;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class BomberMan {

    public static void main(String[] args) throws IOException {
        
        MapFile mapFile = new MapFile(new File("map.bin"));
       
        JFrame window = new JFrame();
        
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(480, 360);
        window.setResizable(true);
        window.setBackground(Color.CYAN);
        window.setContentPane(new Map(mapFile));
        window.setVisible(true);
        
  
        
        
       
    }

}
