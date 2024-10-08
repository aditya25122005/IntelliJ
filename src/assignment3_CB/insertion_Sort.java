package assignment3_CB;
import java.util.*;
public class insertion_Sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,N);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sort(int[] arr,int N){
        for(int i=1;i<N;i++){
            insertElement(arr,i);
        }
    }
    public static void insertElement(int [] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>arr[j+1]){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }

    }
}
