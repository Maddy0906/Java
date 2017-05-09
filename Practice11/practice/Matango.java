package Java.Practice11.practice;

import Java.Practice11.Hero;

/**
 * Created by madoka on 2017/05/08.
 */
public class Matango {
    int hp = 50;
    private char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }

    public void attack(Hero h){
        System.out.println("Mashroom"+ this.suffix + "attack");
        System.out.println("10 damages");
        h.setHp(h.getHp()-10);
    }
}
