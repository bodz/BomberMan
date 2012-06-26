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
    
    public void writeMap() throws IOException {
        String lign = "";
        boolean success;
        
        for(int i1 = 0; i1 < 12; i1++) {
            
            do {           
                System.out.print("Lign" + i1 + " :");
                lign = Scan.readString();
                success = descriptAndWriteMapLign(lign);
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
    
    public char[][] readMap() throws IOException {
        char[][] mapTab = new char[12][16];
        String lign;
        
        seekFile(1);
        
        for(int i1 = 0; i1 < 12; i1++) {
            lign = readString(16);
            
            for(int i2 = 0; i2 < 16; i2++) {
                mapTab[i1][i2] = lign.charAt(i2);
            }                        
        }
        
        return mapTab;
    }
    
    @Override
    public String toString() {
        String retour = "";
        char[][] tab = new char[12][16];
        
        try {
            tab = readMap();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        for(int i1 = 0; i1 < 12; i1++) {
            for(int i2 = 0; i2 < 16; i2++) {
                retour += tab[i1][i2];
            }
            retour += "\n";
        }
        
        return retour;
    }
    
    
    
    

}
