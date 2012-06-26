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
        super(mapFile, "rw", 16);
        this.mapFile = mapFile;        
    }
    
    //=======================================================================================//
    //                                                                              METHODS                                                                                //
    //=======================================================================================//
    
    public void writeMapFile() throws IOException {
        String temp = "";
        boolean success;
        
        for(int i1 = 0; i1 < 12; i1++) {
            
            do {           
                System.out.print("Lign" + i1 + " :");
                temp = Scan.readString();
                success = descriptAndWriteMapLign(temp);
                System.out.print("\n");
            } while(!success);
        }       
    }
    
    private boolean descriptAndWriteMapLign(String lign) throws IOException {
        if(lign.length() == 16) {
            writeString(lign, 16);
            return true;
        }
        return false;
    }
    
    
    
    

}
