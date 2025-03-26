package winter_arc;
import java.util.*;
public class leetcode_2033 {
    public static void main(String[] args) {
        int [][] grid={{2,4},{6,8}};
        int x=4;
        System.out.println(minOperations(grid,x));
    }
    public static int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int opr=0;
        int rem1=grid[0][0]%x;
        int [] arr=new int[n*m];
        int  idx=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[idx++]=grid[i][j];
                int rem = grid[i][j]%x;
                if(rem!=rem1){
                    return -1;
                }
            }
        }
        Arrays.sort(arr);
        int lo=0;
        int hi= n*m -1;
        int mid=lo+(hi-lo)/2;
        int make=arr[mid];
        for(int num:arr){
            opr+=Math.abs((num-make)/x);
        }
        return opr;
    }
}
