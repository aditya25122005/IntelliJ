package assignment3_CB;
import java.util.*;
public class cal_sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long [] arr=new long[N];
        long sum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i]%1000000007;

        }
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int m=sc.nextInt();
            sum=(2*sum)%1000000007;
        }


        System.out.print(sum);

    }
}
