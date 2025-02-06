package winter_arc;
import java.util.*;
public class leetcode_40 {
    public static void main(String[] args) {
        int[] candi={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(candi,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candi, int target) {
        Arrays.sort(candi);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        func(candi,target,ans,ll,0);
        return ans;

    }
    public static void func(int [] candi,int target,List<List<Integer>> ans, List<Integer> ll,int idx){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candi.length;i++){
            if(i>idx &&candi[i]==candi[i-1]){
                continue;
            }
            if(candi[i]>target){
                break;
            }
            ll.add(candi[i]);
            func(candi,target-candi[i],ans,ll,i+1);
            ll.remove(ll.size()-1);
        }

    }
}
