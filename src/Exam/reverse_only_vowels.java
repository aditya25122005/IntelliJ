package Exam;
import java.util.*;
public class reverse_only_vowels {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        HashSet<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while(left<right){
            while( left<right && !(vowels.contains(arr[left]))){
                left++;
            }
            while(left<right && !(vowels.contains(arr[right]))){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            sb.append(ch);

        }
        System.out.println(sb.toString());

    }
}