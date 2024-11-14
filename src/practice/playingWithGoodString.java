package practice;
import java.util.*;
public class playingWithGoodString {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            else{
                if(count>=maxCount){
                    maxCount=count;
                }
                count=0;
            }

        }
        if(count>maxCount){
            maxCount=count;
        }
        System.out.println(maxCount);
    }
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}
