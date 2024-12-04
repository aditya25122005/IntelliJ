package Exam;
import java.util.*;
public class three_sum {
    public static void main(String[] args) {
        int [] arr={3,3,4,5,7,1,2,3,9};
        int target=10;
        Arrays.sort(arr);
        pair(arr,target);


    }
    public static void pair(int[] arr,int target){
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    System.out.println(arr[i]+","+arr[left]+","+arr[right]);
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
