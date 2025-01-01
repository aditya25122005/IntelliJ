package winter_arc;

public class leetcode_1014 {
    public static void main(String[] args) {
        int [] values={8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(values));
    }
    public static int maxScoreSightseeingPair(int[] values) {
        int maxvalue=0;
        int cur=0;
        for(int i=0;i<values.length;i++){
            maxvalue=Math.max(maxvalue,cur+values[i]);
            cur=Math.max(cur,values[i])-1;
        }
        return maxvalue;

    }
}
