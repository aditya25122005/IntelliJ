package Exam;
import java.util.*;
public class two_sum {
    public static void main(String[] args) {
        int [] arr={3,5,2,1,6,7,8};
        int target=8;
        Arrays.sort(arr);
        pair(arr,target);
    }
    public static void pair(int [] arr, int target){
        ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
               l1.add(new ArrayList<>(Arrays.asList(arr[left],arr[right])));
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
        System.out.println(l1);
    }
}
