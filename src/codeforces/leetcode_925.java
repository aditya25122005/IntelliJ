package codeforces;

public class leetcode_925 {
    public static void main(String[] args) {
        String s1="aditya";
        String s2="additttya";

        System.out.println(isLongPressedName(s1,s2));
    }
    public static boolean isLongPressedName(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int i=0;
        int j=0;
        while(j<s2.length()){ //&& i<s1.length()){
            if(i<s1.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else if(j>0 && s2.charAt(j)==s2.charAt(j-1)){
                j++;
            }
            else{
                return false;
            }
        }
        return i==s1.length();
    }
}
