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
        setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(480, 360);
        this.setResizable(false);
        this.setTitle("BomberMan by BlueBirdTeam");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
    }
    

}
