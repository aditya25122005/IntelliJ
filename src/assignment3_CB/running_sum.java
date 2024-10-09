package assignment3_CB;
import java.util.*;
public class running_sum {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }


        int [] sum=new int[N];
        sum[0]=arr[0];
        for(int i=1;i<N;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        for(int i=0;i<N;i++){
            System.out.print(sum[i]+" ");
        }


    }
}
