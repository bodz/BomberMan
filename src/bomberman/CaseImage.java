package bomberman;

import java.io.*;
import java.util.*;
import Utilitaires.*;
import javax.swing.*;
import java.awt.*;

public class CaseImage extends Container {

    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private Image imgFile = getToolkit().getImage("Wall.png");
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public CaseImage(String imgFile) {
        paint();
    }

    public void paint() {
        
    }
    
}
