package Exam;

public class inverse_number {
    public static void main(String[] args) {
        int num=14523;
        int p=0;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=Math.pow(10,p)*digit;
            p++;
            num=num/10;

        }
        System.out.println(sum);
    }
}
