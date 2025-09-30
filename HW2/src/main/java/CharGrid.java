// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid;

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     *
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int rows = grid.length, cols = grid[0].length;
        int max_row = -1, min_row = rows, max_col = -1, min_col = cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == ch) {
                    if (max_row < i) {
                        max_row = i;
                    }
                    if (min_row > i) {
                        min_row = i;
                    }
                    if (max_col < j) {
                        max_col = j;
                    }
                    if (min_col > j) {
                        min_col = j;
                    }
                }
            }
        }
        if (max_row == -1) {
            return 0;
        }

        return (max_row - min_row + 1) * (max_col - min_col + 1); // YOUR CODE HERE
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     *
     * @return number of + in grid
     */
    public int countPlus() {
        int rows = grid.length, cols = grid[0].length, count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int up = countBranch(i, j, -1, 0, grid[i][j]);
                int down = countBranch(i, j, 1, 0, grid[i][j]);
                int left = countBranch(i, j, 0, -1, grid[i][j]);
                int right = countBranch(i, j, 0, 1, grid[i][j]);

                if (up >= 1 && up == down && up == left && up == right) {
                    count++;
                }

            }
        }
        return count; // YOUR CODE HERE
    }

    /**
     * Dem do dai nhanh.
     *
     * @param row toa do hang bat dau
     * @param col toa do cot bat dau
     * @param dr  huong di theo hang (-1 huong len, 1 huong xuong, 0 giu nguyen)
     * @param dc  huong di theo cot (-1 sang trai, 1 sang phai, 0 giu nguyen)
     * @param ch  char can dem
     * @return
     */
    private int countBranch(int row, int col, int dr, int dc, char ch) {
        int rows = grid.length, cols = grid[0].length, count = 0;
        row += dr;
        col += dc;
        while (row >= 0 && row < rows && col >= 0 && col < cols && grid[row][col] == ch) {
            count++;
            row += dr;
            col += dc;
        }
        return count;

    }

}
