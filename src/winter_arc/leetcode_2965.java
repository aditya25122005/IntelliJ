package winter_arc;

public class leetcode_2965 {
    public static void main(String[] args) {
        int [][] grid={{1,2},{2,3}};
        System.out.println(findMissingAndRepeatedValues(grid));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int [] freq=new int[n*n +1];
        int [] ans=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(i!=0 && freq[i]==0){
                ans[1]=i;
            }
            if(freq[i]==2){
                ans[0]=i;
            }
        }
        return ans;
    }
}
