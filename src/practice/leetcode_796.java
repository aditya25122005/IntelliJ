package practice;

public class leetcode_796 {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s,goal));

    }
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        else{
            return (s+s).contains(goal);
        }

    }
}
