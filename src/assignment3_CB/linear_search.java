package assignment3_CB;
import java.util.*;
public class linear_search {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        int m=sc.nextInt();
        System.out.println(func(arr,N,m));
    }
    public static int func(int arr[],int N,int m){

        for(int i=0;i<N;i++){
            if(arr[i]==m){

                return i;


            }
        }
        return -1;
    }

}
