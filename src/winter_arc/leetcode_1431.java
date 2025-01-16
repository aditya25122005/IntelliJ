package winter_arc;
import java.util.*;
public class leetcode_1431 {
    public static void main(String[] args) {
        int [] candies={2,3,5,1,3};
        int extraCandies=3;
        kidsWithCandies(candies,extraCandies);
    }
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> ans=new ArrayList<>();
        for(int candy:candies){
            if(candy>max){
                max=candy; //5
            }
        }
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i]>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
}
