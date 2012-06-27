package Files;

import java.io.*;
import java.util.*;
import Utilitaires.*;

public class MapFile extends FileIO {
    
    //=======================================================================================//
    //                                                                           VARIABLES   //
    //=======================================================================================//
    
    private File mapFile;
    private final int nbCol = 16;
    private final int nbLine = 12;
    
    //=======================================================================================//
    //                                                                       CONSTRUCTORS    //
    //=======================================================================================//
    
    public MapFile(File mapFile) throws IOException {
        super(mapFile, "rw", 16);
        this.mapFile = mapFile;        
    }
    
    //=======================================================================================//
    //                                                                              METHODS  //
    //=======================================================================================//
    
    public int getNbLine() {
        return nbLine;
    }
    
    public int getNbCol() {
        return nbCol;
    }
    public void writeMap() throws IOException {
        String line = "";
        boolean success;
        
        for(int i1 = 0; i1 < nbLine; i1++) {
            
            do {           
                System.out.print("Line" + i1 + " :");
                line = Scan.readString();
                success = descriptAndWriteMapLign(line);
                System.out.print("\n");
            } while(!success);
        }       
    }
    
    private boolean descriptAndWriteMapLign(String lign) throws IOException {
        if(lign.length() == nbCol) {
            writeString(lign, nbCol);
            return true;
        }
        return false;
    }
    
    public char[][] readMap() throws IOException {
        char[][] mapTab = new char[nbLine][nbCol];
        String lign;
        
        seekFile(1);
        
        for(int i1 = 0; i1 < nbLine; i1++) {
            lign = readString(nbCol);
            
            for(int i2 = 0; i2 < nbCol; i2++) {
                mapTab[i1][i2] = lign.charAt(i2);
            }                        
        }
        
        return mapTab;
    }
    
    @Override
    public String toString() {
        String retour = "";
        char[][] tab = new char[nbLine][nbCol];
        
        try {
            tab = readMap();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        for(int i1 = 0; i1 < nbLine; i1++) {
            for(int i2 = 0; i2 < nbCol; i2++) {
                retour += tab[i1][i2];
            }
            retour += "\n";
        }
        
        return retour;
    }
    
    
    
    

}
