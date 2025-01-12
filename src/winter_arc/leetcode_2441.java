package winter_arc;
import java.util.*;
public class leetcode_2441 {
    public static void main(String[] args) {
        int [] arr={-1,2,-3,3};
        System.out.println(findMaxK(arr));
    }
    public static int findMaxK(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);  //-3,-1,2,3
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[right]==-arr[left]){
                return arr[right];
            }
            else if(-arr[left]<arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return -1;
    }
}
