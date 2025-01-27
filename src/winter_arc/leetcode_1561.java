package winter_arc;
import java.util.*;
public class leetcode_1561 {
    public static void main(String[] args) {
        int[] piles={2,4,1,2,7,8};
        System.out.println(maxCoins(piles));
    }
    public static int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int ans=0;
        for(int i=piles.length-2;i>=n/3;i-=2){
            ans+=piles[i];
        }
        return ans;
    }
}
