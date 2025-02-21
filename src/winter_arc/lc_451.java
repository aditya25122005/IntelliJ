package winter_arc;

import java.util.Arrays;

public class lc_451
{
    public static void main(String[] args) {
        String s="aAbb";
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        for(char ch:arr){
            System.out.println(ch);
        }
        System.out.println(String.valueOf(arr));
    }

}
