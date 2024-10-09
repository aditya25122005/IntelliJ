package assignment3_CB;
import java.util.*;
public class product_except_self {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        long [] left=new long[N];
        long [] right=new long[N];

        left[0]=1;
        for(int i=1;i<N;i++){
            left[i]=left[i-1]*arr[i-1];
        }

        right[N-1]=1;
        for(int i=N-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }

        for(int i=0;i<N;i++){
            System.out.print(left[i]*right[i]+" ");
        }

    }
}
