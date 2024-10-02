package com.example;

public class Deposito extends Thread{
    Cestino cestino;
    int quantita;
    
    public Deposito(Cestino cestino, int quantita){
        this.cestino=cestino;
        this.quantita=quantita;

    }
    
    public void run(){

        for(int i=0;i<quantita; i++){
            cestino.aggiungiMoneta();
        }
    }
    
}
