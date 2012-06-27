package Models;

import java.io.*;
import java.util.*;
import Utilitaires.*;

public class Player {

    private int posX;
    private int posY;
    private int health;
    private int lifes;
    
    public Player(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.health = 100;
        this.lifes = 3;
    }
    
    public void setPosX(int posX) {
        this.posX = posX;
    }
    
    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setLifes(int lifes) {
        this.lifes = lifes;
    }
    
    public int getPosX() {
        return posX;
    }
    
    public int getPosY() {
        return posY;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getLifes() {
        return lifes;
    }
  
}
