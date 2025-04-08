package winter_arc;
import java.util.*;
public class leetcode_921 {
    public static void main(String[] args) {
        String s="())";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }

            else if(s.charAt(i)==')' && !st.isEmpty()){
                if(st.peek()=='('){
                    st.pop();
                }
            }
            else{
                count++;
            }
        }
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
        return count;
    }
}
