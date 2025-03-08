package winter_arc;
import java.util.*;
public class leetcode_1630 {
    public static void main(String[] args) {
        int [] nums={4,6,5,9,3,7};
        int []l={0,0,2};
        int [] r={2,3,5};

        System.out.println(checkArithmeticSubarrays(nums,l,r));
    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int [] arr=Arrays.copyOfRange(nums,l[i],r[i]+1);
            if(is_valid(arr)){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
    public static boolean is_valid(int [] arr){
        Arrays.sort(arr);
        if(arr.length<2){
            return true;
        }
        int d=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] != d){
                return false;
            }
        }
        return true;
    }
}
