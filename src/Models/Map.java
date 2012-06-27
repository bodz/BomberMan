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
        
        // Lecture de la map
        char[][] mapTab = mapFile.readMap();
        
        for(int i1 = 0; i1 < mapFile.getNbLine(); i1++) {
            for (int i2 = 0; i2 < mapFile.getNbCol(); i2++) {
                // début remplissage map
                
                switch(mapTab[i1][i2]) {                   
                    case 'o' :
                        // Case "vide"
                        add(new EmptyCase("test.png"));
                        break;
                    case 'w' :
                        // Case mur
                        add(new WallCase("Wall.jpg"));
                        break;
                    case 'b' :
                        // Case brique
                        add(new BrickCase("Brick.jpg"));
                        break;
                }
                // fin remplissage map
            }
        }
        
    }
    

}
