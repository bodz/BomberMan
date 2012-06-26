package bomberman;

import java.io.*;
import java.util.*;
import Utilitaires.*;
import javax.swing.*;
import java.awt.*;

public class CaseImage extends JLabel {

    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private String imgFile;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public CaseImage(String imgFile) {
        setIcon(new ImageIcon(imgFile));
    }

    
}
