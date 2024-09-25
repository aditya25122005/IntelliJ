package java22sept;
import java.util.*;
public class pairOfRoses {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        for(int j=1;j<=T;j++){
            int N=sc.nextInt();
            int [] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int M=sc.nextInt();

            sort(arr,N);

            int left=0;
            int right=N-1;

            int bestLeft = -1;
            int bestRight = -1;
            int minDiff = Integer.MAX_VALUE;
            while(left<right){
                if(arr[left]+arr[right]==M){
                    int diff = Math.abs(arr[left] - arr[right]);
                    if (diff < minDiff) {
                        minDiff = diff;
                        bestLeft = left;
                        bestRight = right;
                    }


                    left++;
                    right--;
                }
                else if(arr[left]+arr[right]<M){
                    left++;
                }
                else{
                    right--;
                }
            }
            if(bestLeft !=-1 && bestRight!=-1 ){
                System.out.printf("Deepak should buy roses whose prices are %d and %d.",arr[bestLeft],arr[bestRight]);
            }

            System.out.println();
        }

    }
    public static void sort(int [] arr,int N){
        for( int i = 0;i<arr.length;i++){
            int idx=min_from_ith_index(arr,i);
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
}
