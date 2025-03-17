package winter_arc;
import java.util.*;
public class leetcode_1408 {
    public static void main(String[] args) {
        String [] words={"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
    public static List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].indexOf(words[i])!=-1){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
