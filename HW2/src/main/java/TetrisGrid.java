//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean grid[][];

    /**
     * Constructs a new instance with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }


    /**
     * Does row-clearing on the grid (see handout).
     */
    public void clearRows() {
        for (int j = 0; j < grid[0].length; j++) {
            boolean check = true;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == false) {
                    check = false;
                    break;
                }
            }
            if (check) {
                for (int i = 0; i < grid.length; i++) {
                    for (int k = j; k + 1 < grid[0].length; k++) {
                        grid[i][k] = grid[i][k + 1];
                    }
                    grid[i][grid[0].length - 1] = false;
                }
            }
        }
    }

    /**
     * Returns the internal 2d grid array.
     *
     * @return 2d grid array
     */
    boolean[][] getGrid() {
        return grid; // YOUR CODE HERE
    }
}
