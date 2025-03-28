package winter_arc;
import java.util.*;
public class leetcode_347 {
    public static void main(String[] args) {
        int [] nums={1,2,1,3,3,3,4,6,2,3,4};
        int k=2;
        System.out.println(topKFrequent(nums,k));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int [] ans=new int[k];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for(int num:map.keySet()){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans[i]=minHeap.poll();
        }
        return ans;

    }
}
