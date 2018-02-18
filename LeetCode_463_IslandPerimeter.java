/**
 * Created by oliverwang on 2018/2/18.
 */


public class LeetCode_463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count = 0, repeat = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1){
                    count++;
                    if (i!=0 && grid[i-1][j] == 1) repeat++;//判断有没有重合
                    if (j!=0 && grid[i][j-1] == 1) repeat++;
                }
            }
        }
        return count*4 - repeat*2;
    }
}
