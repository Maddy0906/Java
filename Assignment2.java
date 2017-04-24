/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mnara
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Enter a word");

        Scanner scan = new Scanner(System.in);
        //word
        String word = scan.nextLine();

        System.out.printf(translate(word));

    }

    static ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
    static ArrayList<String> consonants = new ArrayList<>(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"));

    public static String translate(String word) {
        //chang word to array.
        String[] wo = word.split("");
        String resultWord = "";

        for (int i = 0; i < wo.length; i++) {

            //case of not containing vowels
            if (vowels.indexOf(wo[i]) == -1) {

                //case of b,c.
                if (consonants.indexOf(wo[i]) == 0 || consonants.indexOf(wo[i]) == 1) {
                    resultWord += consonants.get(i) + vowels.get(0) + consonants.get(i + 1);
                    continue;
                }

                //case of d,f,g.
                if (consonants.indexOf(wo[i]) == 2 || consonants.indexOf(wo[i]) == 3 || consonants.indexOf(wo[i]) == 4) {
                    resultWord += consonants.get(i) + vowels.get(1) + consonants.get(i + 1);
                    continue;
                }
                //case of h,j,k,l.
                if (consonants.indexOf(wo[i]) == 5 || consonants.indexOf(wo[i]) == 6 || consonants.indexOf(wo[i]) == 7 || consonants.indexOf(wo[i]) == 8) {
                    resultWord += consonants.get(i) + vowels.get(2) + consonants.get(i + 1);
                    continue;
                }
                //case of m,n,p,q,r.
                if (consonants.indexOf(wo[i]) == 9 || consonants.indexOf(wo[i]) == 10 || consonants.indexOf(wo[i]) == 11 || consonants.indexOf(wo[i]) == 12) {
                    resultWord += consonants.get(i) + vowels.get(3) + consonants.get(i + 1);
                    continue;
                }
                //case of s,t,v,w,x,y,z.
                if (consonants.indexOf(wo[i]) == 13 || consonants.indexOf(wo[i]) == 14 || consonants.indexOf(wo[i]) == 15 || consonants.indexOf(wo[i]) == 16 || consonants.indexOf(wo[i]) == 17 || consonants.indexOf(wo[i]) == 18) {
                    resultWord += consonants.get(i) + vowels.get(4) + consonants.get(i + 1);
                    continue;
                }
                if (consonants.indexOf(wo[i]) == 19) {
                    resultWord += consonants.get(i) + vowels.get(4) + consonants.get(i + 1);
                    continue;
                }
            }else {
                //case of containing vowels
                resultWord +=vowels.get(i);
            }

        }

        return resultWord;


    }
}


