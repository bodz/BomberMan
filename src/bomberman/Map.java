package bomberman;

import java.io.*;
import java.util.*;
import Utilitaires.*;
import javax.swing.*;
import java.awt.*;

public class Map extends JFrame {
    
    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private MapFile mapFile;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public Map(MapFile mapFile) {
        this.mapFile = mapFile;
        GridLayout grid = new GridLayout(12, 16);
        setLayout(grid);
        this.setSize(360, 480);
        this.setVisible(true);
        
        
    }
    

}
