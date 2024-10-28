package ass_4;

import java.util.*;
public class rotate_image {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxc=arr.length-1;
        int maxr=arr.length-1;
        int minr=0;
        int minc=0;
        for(int j=0;j<N;j++){

            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            System.out.println();
            maxc--;

        }

    }
}
