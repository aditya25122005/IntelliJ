package winter_arc;
import java.util.*;
public class leetcode_1207 {
    public static void main(String[] args) {
        int [] arr={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int [] freq=new int[2001];
        for(int n:arr){
            freq[n+1000]++;
        }
        HashSet<Integer> hh=new HashSet<>();
        for(int f:freq){
            if(f>0){
                if(!hh.add(f)){
                    return false;
                }
            }
        }
        return true;


    }
}
