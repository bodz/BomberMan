package bomberman;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Map extends JFrame {
    
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
        setLayout(grid);
        setBackground(Color.RED);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(480, 360);
        this.setResizable(false);
        this.setTitle("BomberMan by BlueBirdTeam");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        char[][] mapTab = mapFile.readMap();
        String temp = "";
        
        BufferedImage brick = null;
        BufferedImage wall = null;
        
        try {
            brick = ImageIO.read(new File("Brick30px.png"));
            wall = ImageIO.read(new File("Wall.png"));
        }
        catch(IOException e) {
            
        }
        
        for(int i1 = 0; i1 < 12; i1++) {
            for (int i2 = 0; i2 < 16; i2++) {
                temp = "";
                temp += mapTab[i1][i2];
                
                switch(temp) {                   
                    case "o" :
                        this.add(new JLabel("O"));
                        break;
                    case "w" :
                        this.add(new JLabel(new ImageIcon(brick)));
                        break;
                    case "b" :
                        this.add(new JLabel(new ImageIcon(wall)));
                        break;
                }
            }
        }
        
    }
    

}
