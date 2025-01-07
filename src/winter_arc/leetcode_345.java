package winter_arc;
import java.util.*;
public class leetcode_345 {
    public static void main(String[] args) {
        String s="IceCreAm";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        HashSet<Character>h1=new HashSet<>(Arrays.asList('a','e','o','i','u','A','E','I','O','U'));
        while(left<right){
            while(left<right && !(h1.contains(arr[left]))){
                left++;
            }
            while(left<right && !(h1.contains(arr[right]))){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: arr){
            sb.append(ch);
        }
        return sb.toString();

    }
}
