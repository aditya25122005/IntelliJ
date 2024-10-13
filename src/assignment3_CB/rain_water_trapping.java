package assignment3_CB;
import java.util.*;
public class rain_water_trapping {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int N=sc.nextInt();
            int [] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int[] left=new int[N];
            int[] right=new int[N];

            left[0]=arr[0];
            for(int i=1;i<N;i++){
                left[i]=Math.max(left[i-1],arr[i]);
            }

            right[N-1]=arr[N-1];
            for(int i=N-2;i>=0;i--){
                right[i]=Math.max(right[i+1],arr[i]);
            }
            int sum=0;
            for(int i=0;i<N;i++){
                sum+=Math.min(right[i],left[i])-arr[i];
            }
            System.out.println(sum);
        }

    }
}
