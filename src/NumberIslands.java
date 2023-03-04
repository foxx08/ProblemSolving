public class NumberIslands {
    /*
    Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
    You may assume all four edges of the grid are all surrounded by water.
    Source: https://leetcode.com/problems/number-of-islands/
     */

    public int numIslands(char[][] grid) {
        int count = 0;
        if(grid == null) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count += dfs(grid, i, j);
                }
            }

        }
        System.out.println(count);
        System.out.println(grid[0].length);
        return count;
    }

    public int dfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0'; //if we actually found a 1, we wanna set it to 0, in order to not count it anymore
        //Now we gonna check the adjacents
        dfs(grid, i + 1, j); //above
        dfs(grid, i - 1, j); //down
        dfs(grid, i, j + 1); //right
        dfs(grid, i, j - 1); //left
        return 1;
    }

}
