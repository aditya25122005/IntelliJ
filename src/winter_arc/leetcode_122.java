package winter_arc;

public class leetcode_122 {
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int totalProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                totalProfit+=(prices[i]-prices[i-1]);
            }
        }
        return totalProfit;

    }
}
