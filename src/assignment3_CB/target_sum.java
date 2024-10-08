package assignment3_CB;
import java.util.*;
public class target_sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //input array
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target=sc.nextInt();
        for(int i=0;i<N-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=N-1;

            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);


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
}
