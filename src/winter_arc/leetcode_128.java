package winter_arc;
import java.util.*;
public class leetcode_128 {
    public static void main(String[] args) {
        int [] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxlen=1;
        int si=0;

        HashSet<Integer> hh = new HashSet<>();
        for(int num:nums){
            hh.add(num);
        }
        List<Integer> ll = new ArrayList<>(hh);
        Collections.sort(ll);
        for(int i=1;i<ll.size();i++){
            if(ll.get(i)-ll.get(i-1)==1){
                maxlen=Math.max(maxlen,i-si+1);
            }
            else{
                si=i;
            }
        }
        return maxlen;
    }
}
