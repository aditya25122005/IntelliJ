package practice;

public class leetcode_1071 {
    public static void main(String[] args) {
        String str1="ABABAB", str2="ABAB";
        System.out.println(gcdOfStrings(str1,str2));


    }
    public static String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){


            int x=str1.length();
            int y=str2.length();
            int GCD=GCD(x,y);
            return str1.substring(0,GCD);
        }
        else{
            return "";
        }
    }
    public static int GCD(int x,int y){
        if(x==0) return y;
        if(y==0) return x;
        if(x==y) return x;
        if(x>y) return GCD(x-y,y);
        return GCD(x,y-x);


    }



}
