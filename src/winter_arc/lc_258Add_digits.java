package winter_arc;

public class lc_258Add_digits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {

        while(num>=10){
            int sum=0;
            while(num!=0){
                int rem=num%10;
                sum+=rem;
                num/=10;
            }
            num=sum;
        }

        return num;
    }
}
