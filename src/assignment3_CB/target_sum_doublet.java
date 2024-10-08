package assignment3_CB;
import java.util.*;
public class target_sum_doublet {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        int target=sc.nextInt();
        Arrays.sort(arr);

        int left=0;
        int right=N-1;
        // if( left<right && arr[i]==arr[i-1]){
        //     continue;
        // }
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" and "+arr[right]);

                while(left<right && arr[left]==arr[left+1]){
                    left++;
                }
                while(left<right && arr[right]==arr[right-1]){
                    right--;
                }

                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }


    }
}
