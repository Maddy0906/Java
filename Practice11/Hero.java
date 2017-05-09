package Java.Practice11;

/**
 * Created by madoka on 2017/05/08.
 */
public class Hero {
    private String name = "minato";
    private int hp = 100;

    //fight
    public void attack(Matango m){
        System.out.println(this.name + "attack!");
        m.hp -=5;
        System.out.println("5point damage to enemy");
    }

    //escape
    public void run(){
        System.out.println(this.name+ "run away!");
    }
}
