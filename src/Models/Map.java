package Models;

import Files.MapFile;
import Vues.Case;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    
    //=======================================================================================//
    //                                                                           VARIABLES   //
    //=======================================================================================//
    
    private MapFile mapFile;

    //=======================================================================================//
    //                                                                       CONSTRUCTORS    //
    //=======================================================================================//
    
    public Map(MapFile mapFile) throws IOException {
        this.mapFile = mapFile;
        
        GridLayout grid = new GridLayout(mapFile.getNbLine(), mapFile.getNbCol());
        setLayout(grid);
        setBackground(Color.BLACK);
        
        // Lecture de la map
        char[][] mapTab = mapFile.readMap();
        
        for(int i1 = 0; i1 < mapFile.getNbLine(); i1++) {
            for (int i2 = 0; i2 < mapFile.getNbCol(); i2++) {
                
                switch(mapTab[i1][i2]) {                   
                    case 'o' :
                        add(new Case("test.png"));
                        break;
                    case 'w' :
                        add(new Case("Wall.jpg"));
                        break;
                    case 'b' :
                        add(new Case("Brick.jpg"));
                        break;
                }
            }
        }
        
    }
    

}
