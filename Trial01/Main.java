package Java.Trial01;

/**
 * Created by madoka on 2017/05/14.
 */
public class Main {
    public static void main(String[] args){

//        //equal
//        String s1 = "すっきりJava";
//        String s2 = "Java";
//        String s3 = "java";
//
//        if (s2.equals(s3)){
//            System.out.println("s2とs3は等しい");
//        }
//        if (s2.equalsIgnoreCase(s3)){
//            System.out.println("s2とs3は区別しなければ等しい");
//        }
//        System.out.println("s1の長さは"+s1.length()+ "です");

//        //indexOf
//        String s1 = "Java and JavaScript";
//        if (s1.contains("Java")){
//            System.out.println("文字列s1はJavaを含んでいます");
//        }
//        if (s1.endsWith("Java")){
//            System.out.println("文字列s1はJavaが末尾にあります");
//        }
//        System.out.println("文字列s1で最初にJavaが登場する位置は"+ s1.indexOf("Java"));
//        System.out.println("文字列s1で最後にJavaが登場する位置は"+s1.lastIndexOf("Java"));
//
//        String s1 = "Java programing";
//        System.out.println("文字列s1の3文字目以降"+ s1.substring(3));
//        System.out.println("文字列のs1の3~8文字目は" +s1.substring(3,8));

//        //StringBuilder
//        StringBuilder sb = new StringBuilder();
//        for (int i =0; i < 10000; i++){
//            sb.append("Java");
//        }
//        String s = sb.toString();

        boolean isValidPlyaerName(String name){
            return name.matches("[A-Z][A-Z0-9]{7}");
        }
    }
}
