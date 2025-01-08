package Exam;
import java.util.*;
public class ThreeSumWOrepeated {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,2,2};
        int target=5;
        Arrays.sort(arr);
        pair(arr,target);
    }
    public static void pair(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length-2;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                    count++;
//                    while(left<right && arr[left+1]==arr[left]){
//                        left++;
//                    }
//                    while(left<right && arr[right]==arr[right-1]){
//                        right--;
//                    }
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
        System.out.println(count%10000007);
    }
}
