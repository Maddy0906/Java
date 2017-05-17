package Java.Practice4;

import java.util.Scanner;

/**
 * Created by madoka on 2017/05/16.
 */
public class P4_5 {
    public static void main(String args[]) {


        int[] numbers = {3, 4, 9};
        System.out.println("一桁の数字を入力してください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int n : numbers){
            if (num == n){
                System.out.println("アタリ！");
            }
        }

    }
}
