package bomberman;

import java.io.File;
import java.io.*;

public class BomberMan {

    public static void main(String[] args) throws IOException {
        
        MapFile mapFile = new MapFile(new File("map.bin"));
       
        new Map(mapFile);
        
       
    }

}
