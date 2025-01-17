package winter_arc;

public class leetcode_1351 {
    public static void main(String[] args) {
        int [][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        int current_row=0;
        int current_col=grid[0].length-1;
        while(current_row<grid.length && current_col>=0){
            if(grid[current_row][current_col]<0){
                count+=grid.length-current_row;
                current_col--;
            }
            else{
                current_row++;
            }
        }
        return count;
    }
}
