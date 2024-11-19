package practice;

public class leetcode_263 {
    public static void main(String[] args) {
        int number =14;
        System.out.println(isUgly(number));
    }
    public static boolean isUgly(int number) {
        if(number<=0) return false;
        if(number==1){
            return true;
        }
        while(number%2==0){
            number/=2;
        }
        while(number%3==0){
            number/=3;
        }
        while(number%5==0){
            number/=5;
        }
        return number==1;
    }
}
