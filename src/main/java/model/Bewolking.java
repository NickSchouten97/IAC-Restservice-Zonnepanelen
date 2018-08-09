package model;

public class Bewolking {
    boolean bewolkt;

    public boolean IsHetBewolkt(double bewolkingkans){
        if(bewolkingkans >= 50){
            bewolkt = true;
        }
        if(bewolkingkans <= 50){
            bewolkt = false;
        }
        return bewolkt;
    }
}
