package assignment3_CB;
import java.util.*;
public class bubble_sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int turn=1;turn<N;turn++){
            for(int i=0;i<N-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }

        }
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }

    }
}
