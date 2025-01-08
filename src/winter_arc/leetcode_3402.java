package winter_arc;

public class leetcode_3402 {
    public static void main(String[] args) {
        int[][] grid={{3,2},{1,3},{3,4},{0,1}};
        System.out.println(minimumOperations(grid));
    }
    public static int minimumOperations(int[][] grid) {
        int count=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=1;j<grid.length;j++){
                if(grid[j-1][i]>=grid[j][i]){
                    int inc=grid[j-1][i]-grid[j][i]+1;
                    grid[j][i]+=inc;
                    count+=inc;
                }
            }
        }
        return count;

    }
}
