package recursion;

public class leetcode_subsequence {
    public static void main(String[] args) {
        String s = "3567";
        int target=9;
        int c=0;
        System.out.println("\n" + count(s, "",target,c));
//        print(s,"");
//        System.out.println("\n"+count);
    }


    public static int count(String s, String ans, int target,int c) {
        if (s.length() == 0) {
            int a=0;
            for(char ch:s.toCharArray()){
                a += Character.getNumericValue(ch);
            }
            if(a==target){
                c++;
            }


            System.out.print(ans + " ");

//            count++;
            return 1;
        }
        char ch = s.charAt(0);
         count(s.substring(1), ans,target,c);
         count(s.substring(1), ans + ch,target,c);
        return c;
    }
}