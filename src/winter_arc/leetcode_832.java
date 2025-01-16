package winter_arc;

public class leetcode_832 {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
    }
    public static int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr[0].length-j-1];
                arr[i][arr[0].length-j-1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }
}
