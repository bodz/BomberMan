package bomberman;

import java.io.*;
import java.util.*;
import Utilitaires.*;

public class MapFile extends FileIO {
    
    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private File mapFile;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public MapFile(File mapFile) throws IOException {
        super(mapFile, "rw", 60);
        this.mapFile = mapFile;        
    }
    
    //=======================================================================================//
    //                                                                              METHODS                                                                                //
    //=======================================================================================//
    
    

}
