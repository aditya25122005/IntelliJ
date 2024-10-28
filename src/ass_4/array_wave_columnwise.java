package ass_4;

import java.util.*;
public class array_wave_columnwise {
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
        for(int i=0;i<N;i++){
            if(i%2==0)
            {
                //lop for row in even case
                for(int j=0;j<M;j++){
                    System.out.print(arr[j][i]+", ");
                }

            }
            else{
                for(int j=M-1;j>=0;j--){
                    System.out.print(arr[j][i]+", ");
                }

            }
        }
        System.out.print("END");


    }
}
