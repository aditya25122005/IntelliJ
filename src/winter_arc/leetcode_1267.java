package winter_arc;

public class leetcode_1267 {
    public static void main(String[] args) {
        int [] [] arr={{1,1,0,1},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(countServers(arr));
    }
    public static int countServers(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int [] row=new int[m];
        int [] col=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    if(row[i]>1 || col[j]>1){
                        ans++;
                    }
                }

            }
        }
        return ans;
    }


}
