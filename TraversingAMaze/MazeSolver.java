package Java.TraversingAMaze;

/**
 * Created by madoka on 2017/04/28.
 */
public class MazeSolver {
    private Maze maze;

    public MazeSolver(Maze maze){
        this.maze = maze;
    }

    public boolean traverse(int row, int column){
        boolean done = false;

        if (maze.validPosition(row,column)){
            maze.tryPosition(row,column);

            if (row == maze.getRows()-1 && column == maze.getColumns()-1)
                done = true;
            else {
                done = traverse(row + 1, column);
                if (!done)
                    done = traverse(row, column + 1);
                if (!done)
                    done = traverse(row - 1, column);
                if (!done)
                    done = traverse(row,column-1);
            }
                if (done)
                    maze.markPath(row,column);
            }
            return done;
        }

}
