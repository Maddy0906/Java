package Java.Practice5;

/**
 * Created by madoka on 2017/05/17.
 */
public class P5_4 {
    public static void main(String[] args){
        double triangleArea = calcTriangleArea(10.0,5.0);
        System.out.println("triangleArea"+triangleArea);
        double circleArea = calcCircleArea(5.0);
        System.out.println("circleAreac"+circleArea);
    }
    public static double calcTriangleArea(double bottom, double height){
        double area = (bottom*height)/2;
        return area;
    }
    public static double calcCircleArea(double radius){
        double area = radius * radius * 3.14;
        return area;
    }
}
