package winter_arc;

public class leetcode_769 {
    public static void main(String[] args) {
        int [] arr={4,3,2,1,0};
        System.out.println(maxChunksToSorted(arr));
    }
    public static int maxChunksToSorted(int[] arr) {
        int count=0;
        // make a chunk wherever current index is equal to the max to the left till now(including curr)
        int maxTillNow=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxTillNow=Math.max(maxTillNow,arr[i]);
            if(i==maxTillNow){
                count++;
            }
        }
        return count;

    }
}
