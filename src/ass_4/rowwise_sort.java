package ass_4;

import java.util.*;
public class rowwise_sort {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int [][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            sort(arr[i]);  //sort(arr);
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
    public static void sort(int [] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}