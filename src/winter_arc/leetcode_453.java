package winter_arc;

public class leetcode_453 {
    public static void main(String[] args) {
        int [] nums={4,2,1};
        System.out.println(minMoves(nums));
    }
    public  static int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int v:nums){
            min=Math.min(min,v);
        }
        for(int val:nums){
            count+=val-min;
        }
        return count;
    }
}
