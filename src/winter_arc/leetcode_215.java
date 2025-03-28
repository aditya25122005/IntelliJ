package winter_arc;
import java.util.*;
public class leetcode_215 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Q1= new PriorityQueue<>();
        for(int num:nums){
            Q1.add(num);
            if(Q1.size()>k){
                Q1.poll();
            }
        }

        return Q1.poll();
    }
}
