package winter_arc;

public class leetcode_1863 {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
        total=0;
        generate(0,nums,0);
        return total;
    }
    static int total=0;
    public static void generate(int idx, int[] arr, int curr){
        if(idx==arr.length){
            total+=curr;
            return;
        }
        generate(idx+1,arr,curr^arr[idx]);
        generate(idx+1,arr,curr);
    }
}
