package Java.TraversingAMaze;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by madoka on 2017/04/28.
 */
public class MazeTester {
   public static void main(String[] args) throws FileNotFoundException{
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the name of the file containing the maze");
       String filename = scan.nextLine();

       Maze labyrinth = new Maze(filename);
       System.out.println(labyrinth);

       MazeSolver solver = new MazeSolver(labyrinth);

       if (solver.traverse(0,0))
           System.out.println("The maze was successfully traversed!");
       else
           System.out.println("There is no possible path");

       System.out.println(labyrinth);
   }
}
