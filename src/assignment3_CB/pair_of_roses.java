package assignment3_CB;
import java.util.*;
public class pair_of_roses {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){

            int N=sc.nextInt();
            int [] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int M=sc.nextInt();
            Arrays.sort(arr);
            int left=0;
            int right=N-1;
            int rose1=0;
            int rose2=0;
            int minDiff=Integer.MAX_VALUE;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==M){
                    if(arr[right]-arr[left] < minDiff){
                        rose1=arr[left];
                        rose2=arr[right];
                        minDiff=arr[right]-arr[left];
                    }
                    left++;
                    right--;
                }
                else if(sum<M){
                    left++;
                }
                else{
                    right--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+rose1+" and "+rose2+".");

        }

    }
}
