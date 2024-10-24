package practice;
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
            int money=sc.nextInt();
            Arrays.sort(arr);
            int bestleft=-1;
            int bestright=-1;
            int min_diff=Integer.MAX_VALUE;
            int left=0;
            int right=N-1;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==money){
                    int diff=Math.abs(arr[left]-arr[right]);
                    if(diff<min_diff){
                        min_diff=diff;
                        bestleft=left;
                        bestright=right;
                    }
                    left++;
                    right--;
                }
                else if(sum<money){
                    left++;
                }
                else{
                    right--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+arr[bestleft]+" and "+arr[bestright]+".");
            System.out.println();
        }

    }
}
