package practice;

public class sum_of_square_no {
    public static void main(String[] args) {
        int c=5;
        System.out.println(judgeSquareSum(c));

    }
    public static boolean judgeSquareSum(int c) {
        long a=0;
        long b=(long) Math.sqrt(c);
        while(a<=b){
            long ans=a*a + b*b;
            if(ans==c){
                return true;
            }
            else if(ans<c){
                a++;
            }
            else{
                b--;
            }
        }
        return false;

    }
}
