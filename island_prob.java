// public class island_prob {
//     public static void main(String[] args) {
//         int[][] grid={{1,1,1,1,0},{1,0,1,1,0},{1,0,0,1,0},{0,1,0,0,1}};
//         //System.out.println(grid.length);/// returns the number of rows
//         //to find the column length use GRID[0].length ie. length of each row....
//         traverse(grid, 0, 0);
//     }
//     public static void traverse(int[][] grid,int row,int col){
//         if(row<0 || row>=grid.length || col<0 || col>=grid[0].length)
//          return;
//         System.out.print(grid[row][col]);
//         traverse(grid, row, col+1);
//         traverse(grid, row+1, col);
//     }
// }
public class island_prob{
    public static void main(String[] args) {
        int[][] grid={
            {1,1,1,1,0},
            {1,0,1,1,0},
            {1,0,0,1,0},
            {0,1,0,0,1}
        };
        
        int count=0;

        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    count++;
                    dulr(grid,i,j);
                }
            }
        }
        System.out.println(count);
    }
    public static void dulr(int[][] grid,int i,int j){
        int row =grid.length;
        int col =grid[0].length;
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]==0) {return;}
        grid[i][j]=0;
        dulr(grid, i+1, j);
        dulr(grid, i-1, j);
        dulr(grid, i, j-1);
        dulr(grid, i, j+1);

    }
}