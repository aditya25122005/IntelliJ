package ass_4;

import java.util.*;
public class spiral_print_anticlockwise {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int [] [] arr=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int t=arr.length*arr[0].length;
        int c=0;
        int minc=0;
        int maxc=arr[0].length-1;
        int minr=0;
        int maxr=arr.length-1;

        while(c<t){
            for(int i=minr;i<=maxr && c<t;i++){
                System.out.print(arr[i][minc]+", ");
                c++;

            }
            minc++;

            for(int i=minc;i<=maxc && c<t;i++){
                System.out.print(arr[maxr][i]+", ");
                c++;
            }
            maxr--;

            for(int i=maxr;i>=minr && c<t;i--){
                System.out.print(arr[i][maxc]+", ");
                c++;
            }
            maxc--;

            for(int i=maxc;i>=minc && c<t;i--){
                System.out.print(arr[minr][i]+", ");
                c++;
            }
            minr++;
        }
        System.out.print("END");

    }
}