package bomberman;

import java.io.*;
import java.util.*;
import Utilitaires.*;

public class MapFile extends FileIO {
    
    //=======================================================================================//
    //                                                                           VARIABLES                                                                                 //
    //=======================================================================================//
    
    private File mapFile;
    private int lignSize = 16;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS                                                                             //
    //=======================================================================================//
    
    public MapFile(File mapFile) throws IOException {
        super(mapFile, "rw", lignSize);
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
        if(lign.length() == lignSize) {
            writeString(lign, lignSize);
            return true;
        }
        return false;
    }
    
    public char[][] readMap() throws IOException {
        char[][] mapTab = new char[12][lignSize];
        String lign;
        
        seekFile(1);
        
        for(int i1 = 0; i1 < 12; i1++) {
            lign = readString(lignSize);
            
            for(int i2 = 0; i2 < lignSize; i2++) {
                mapTab[i1][i2] = lign.charAt(i2);
            }                        
        }
        
        return mapTab;
    }
    
    @Override
    public String toString() {
        String retour = "";
        char[][] tab = new char[12][lignSize];
        
        try {
            tab = readMap();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        for(int i1 = 0; i1 < 12; i1++) {
            for(int i2 = 0; i2 < lignSize; i2++) {
                retour += tab[i1][i2];
            }
            retour += "\n";
        }
        
        return retour;
    }
    
    
    
    

}
