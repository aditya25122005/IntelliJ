package winter_arc;

public class leetcode_2906 {
    public static void main(String[] args) {
        int [][] grid={{1,2},{3,4}};
        System.out.println(constructProductMatrix(grid));
    }
    public static int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long[][] prefix=new long[n][m];
        long[][] suffix=new long [n][m];
        int res[][] =new int[n][m];
        int mod=12345;
        //[1,1,2,6]
        //[24,12,4,1]
        //[24,12,8,6]
        long product=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                prefix[i][j]=product;
                product= (product*grid[i][j]) % mod;
            }
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                suffix[i][j]=product;
                product=(product*grid[i][j]) % mod;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=(int)(prefix[i][j] * suffix[i][j]) % mod;
            }
        }
        return res;
    }
}
