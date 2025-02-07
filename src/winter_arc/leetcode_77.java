package winter_arc;
import java.util.*;
public class leetcode_77 {
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        combinations(n,k,1,ans,ll);
        return ans;
    }


    public static void combinations(int n,int k,int idx,List<List<Integer>> ans ,List<Integer> ll){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<=n;i++){
            ll.add(i);
            combinations(n,k,i+1,ans,ll);
            ll.remove(ll.size()-1);
        }
    }
}
