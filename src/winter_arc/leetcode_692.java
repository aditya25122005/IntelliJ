package winter_arc;
import java.util.*;
public class leetcode_692 {
    public static void main(String[] args) {
        String [] words={"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(words,k));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }
        List<String> wordList=new ArrayList<>(map.keySet());

        wordList.sort((a,b)->{
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b);
            }
            return map.get(b)-map.get(a);
        });

        return wordList.subList(0,k);



    }
}
