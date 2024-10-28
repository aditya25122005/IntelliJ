package ass_4;

import java.util.*;
public class array_wave_rowwise {
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

        for(int i=0;i<M;i++){
            if(i%2==0){
                for(int j=0;j<N;j++){
                    System.out.print(arr[i][j]+", ");
                }
            }
            else{
                for(int j=N-1;j>=0;j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
