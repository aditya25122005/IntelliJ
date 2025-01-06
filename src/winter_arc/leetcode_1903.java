package winter_arc;

public class leetcode_1903 {
    public static void main(String[] args) {
        String num="52";
        System.out.println(largestOddNumber(num));

    }
    public static String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)%2==1){
            return num;
        }
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
