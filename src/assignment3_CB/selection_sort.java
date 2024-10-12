package assignment3_CB;
import java.util.*;
public class selection_sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,N);
        print(arr,N);

    }
    public static void sort(int [] arr,int N){
        for(int i=0;i<N;i++){


            int idx=min_from_ith_index(arr,i);
            //swap
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static int min_from_ith_index(int[] arr,int i){
        int mini=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
    public static void print(int[] arr,int N){
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
    }
}
