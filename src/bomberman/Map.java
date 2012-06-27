package bomberman;

import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    
    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private MapFile mapFile;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public Map(MapFile mapFile) throws IOException, CloneNotSupportedException {
        this.mapFile = mapFile;
        
        GridLayout grid = new GridLayout(12, 16);
        setLayout(grid);
        
        char[][] mapTab = mapFile.readMap();
        String temp;       
        
        for(int i1 = 0; i1 < 12; i1++) {
            for (int i2 = 0; i2 < 16; i2++) {
                temp = "";
                temp += mapTab[i1][i2];
                
                switch(temp) {                   
                    case "o" :
                        add(new JLabel("o"));
                        break;
                    case "w" :
                        add(new Case("Wall.jpg"));
                        break;
                    case "b" :
                        add(new Case("Brick.jpg"));
                        break;
                }
            }
        }
        
    }
    

}
