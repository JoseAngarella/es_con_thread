package com.example;

public class Cestino {
    int valore;
    
    public Cestino(int i){
        valore=i;
    }

    synchronized public void aggiungiMoneta(){
        valore++;
    }

    public int getValore() {
        return valore;
    }

    
}
