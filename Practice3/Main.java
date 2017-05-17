package Java.Practice3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by madoka on 2017/05/15.
 */
public class Main {
        public static void main(String[] args) {
//            int seibetu = 0;
//            int age = 16;
//            System.out.println("こんにちは。");
//
//            if (seibetu == 0) {
//                System.out.println("私は男です");
//            } else {
//                System.out.println("私は女です");
//            }
//            if (seibetu == 0){
//                System.out.println(age +"歳です");
//        }
//    System.out.println("よろしくお願いします");

            boolean tenki = true;
            if (tenki == true){
                System.out.println("洗濯します");
                System.out.println("散歩に行きます");
            }else {
                System.out.println("DVDをみます");
                System.out.println("寝ます");
            }

            System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
            Scanner scan = new Scanner(System.in);

            String num = scan.next();

            switch (num){
                case 1:
                    System.out.println("検索します");
                    break;
                case 2:
                    System.out.println("登録します");
                    break;
                case 3:
                    System.out.println("削除します");
                    break;
                case 4:
                    System.out.println("変更します");
                    break;
            }

            System.out.println("数当てゲーム");
            Random rnd = new Random();
            int ans = rnd.nextInt(10);
            for (int i=0; i < 5; i++ ){
                System.out.println("数字を入力してください");
                Scanner scan2 = new Scanner(System.in);
                String num3 = scan.next();
                if (ans == num3){
                    System.out.println("あたり！！");
                    break;
                }else {
                    System.out.println("違います");
                }
            }
            System.out.println("終了します");

    }
}

