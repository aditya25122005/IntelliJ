package ass_4;
import java.util.*;
public class spiral_print_clockwise  {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[m][n];
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int t=arr.length*arr[0].length;
        int c=0;
        int minc=0;
        int maxc=arr[0].length-1;
        int minr=0;
        int maxr=arr.length-1;

        while(c<t){
            for(int i=minc;i<=maxc && c<t;i++){
                System.out.print(arr[minr][i]+", ");
                c++;

            }
            minr++;
            for(int i=minr;i<=maxr && c<t;i++){
                System.out.print(arr[i][maxc]+", ");
                c++;
            }

            maxc--;

            for(int i=maxc;i>=minc && c<t;i--){
                System.out.print(arr[maxr][i]+", ");
                c++;
            }
            maxr--;

            for(int i=maxr;i>=minr && c<t;i--){
                System.out.print(arr[i][minc]+", ");
                c++;
            }
            minc++;

        }
        System.out.print("END");

    }
}