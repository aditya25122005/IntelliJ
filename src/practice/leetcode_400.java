package practice;

public class leetcode_400 {
    public static void main(String[] args) {
        int n=11;
        System.out.println(findNthDigit(n));

    }
    public static  int findNthDigit(int n) {
        if(n<10){
            return n;
        }
        int digit=1;
        int num_digit=9;
        while(n-num_digit>0){
            n-=num_digit;
            digit+=1;
            num_digit=9*digit*(int)Math.pow(10,digit-1);

            if(num_digit<0) break;
        }

        int base=(int)Math.pow(10,digit-1);
        int number=base+(n-1)/digit;
        char ch=String.valueOf(number).charAt((n-1)%digit);
        return ch-'0';


    }
}
