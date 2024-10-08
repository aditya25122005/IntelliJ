package assignment3_CB;
import java.util.*;
public class square_of_sorted_arr {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            arr[i]=arr[i]*arr[i];
        }
        //sort
        sort(arr);
        print(arr,N);


    }
    public static void sort(int [] arr){
        for(int i=1;i<arr.length;i++){
            insertLastEle(arr,i);
        }
    }
    public static void insertLastEle(int [] arr,int i){
        int j=i-1;
        int item=arr[i];
        while(j>=0 && arr[j]>arr[j+1]){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;

        }
    }
    public static void print(int[] arr,int N){
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
