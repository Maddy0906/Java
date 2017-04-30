package Java.Practice9;

import java.util.Random;

/**
 * Created by madoka on 2017/04/25.
 */
public class Cleric02 {
    String name;
    int hp;
    int mp;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;


    public Cleric02(String name, int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
    }

    public Cleric02(String name, int hp) {
        this(name,hp,Cleric02.MAX_HP);
    }

    public Cleric02(String name) {
        this(name,Cleric02.MAX_HP);
    }

    public class Main {
        public void main(String[] args) {
            Cleric02 c = new Cleric02("アサカ", 40, 5);
        }

//        public void selfAid() {
//            System.out.println(this.name + "はセルフエイドを唱えた！");
//            this.hp = this.MAX_HP;
//            this.mp -= 5;
//            System.out.println("体力がMAXまで回復した");
//        }
//
//        public int pray(int sec) {
//            System.out.println(this.name + "は" + sec + "祈った");
//            int recover = new Random().nextInt(3) + sec;
//
//            int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
//
//            this.mp += recoverActual;
//            System.out.println("MPが" + recoverActual + "回復した");
//            return recoverActual;
//        }
    }
}
