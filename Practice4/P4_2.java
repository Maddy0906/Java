package Java.Practice4;

/**
 * Created by madoka on 2017/05/16.
 */
public class P4_2 {

    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < 3; i++) {
            System.out.println(moneyList[i]);
        }
        for (int m : moneyList){
            System.out.println(m);
        }
    }
}

