package string;
import java.util.*;
public class reverse_vowels {
    public static void main(String[] args) {
        String s="Sneha";
        HashSet<Character> h=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right){
            while(left<right && !(h.contains(arr[left]))){
                left++;
            }
            while(left<right &&!(h.contains(arr[right]))){
                right--;

            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            sb.append(c);
        }
        System.out.println(sb.toString());

    }
}
