package bomberman;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import Utilitaires.*;

public class Map extends JPanel {
    
    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private MapFile mapFile;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public Map(MapFile mapFile) throws IOException {
        this.mapFile = mapFile;
        GridLayout grid = new GridLayout(12, 16);
       
        char[][] mapTab = mapFile.readMap();
        String temp;
        
        JLabel red = new JLabel();
        red.setBackground(Color.red);
        JLabel blue = new JLabel();
        blue.setBackground(Color.blue);
        JLabel black = new JLabel();
        black.setBackground(Color.black);
        
        for(int i1 = 0; i1 < 12; i1++) {
            for (int i2 = 0; i2 < 16; i2++) {
                temp = "";
                temp += mapTab[i1][i2];
                
                switch(temp) {                   
                    case "o" :
                        this.add(red);
                        break;
                    case "w" :
                        this.add(black);
                        break;
                    case "b" :
                        this.add(blue);
                        break;
                }
            }
        }
        
    }
    

}
