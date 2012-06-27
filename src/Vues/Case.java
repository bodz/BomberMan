package Vues;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Case extends JPanel {
    
    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private Image img;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public Case(String imagePath) throws IOException {
        this.img = ImageIO.read(new File(imagePath));
    }
    
    @Override
    public void paintComponent (Graphics g) {
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);        
    }

}
