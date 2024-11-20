package practice;

public class leetcode_121 {
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1){
            return 0;
        }
        int minprice=Integer.MAX_VALUE;
        int maxprice=0;



        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }
            else if(price-minprice>maxprice){
                maxprice=price-minprice;
            }
        }

        return maxprice;
    }
}
