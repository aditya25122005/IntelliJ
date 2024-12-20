package winter_arc;

import java.util.ArrayList;
import java.util.*;

public class four_sum {
    public static void main(String[] args) {
//        ArrayList <Integer> fourSum=new ArrayList<>();
        List<List<Integer>> fourSum=new ArrayList<>();
        int[] arr={1,0,-1,0,-2,2};
        Arrays.sort(arr);
        int target=0;
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }

            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j-1]==arr[j]){
                    continue;
                }
                int left=j+1;
                int right=arr.length-1;
                while(left<right){
                    long ans=(long)arr[i]+arr[j]+arr[left]+arr[right];
                    if(ans==target){
                        fourSum.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        while(left<right && arr[left+1]==arr[left]) left++;
                        while(left<right && arr[right-1]==arr[right]) right--;
                        left++;
                        right--;
                    }
                    else if(ans<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        System.out.println(fourSum);
    }
}
