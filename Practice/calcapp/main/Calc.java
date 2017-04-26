package Java.Practice.calcapp.main;

import Java.Practice.calcapp.logics.*;

/**
 * Created by madoka on 2017/04/24.
 */
public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println("add" + total + "sub" + delta);
    }
}

