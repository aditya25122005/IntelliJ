package Exam;

public class inverse_number {
    public static void main(String[] args) {

        int num=32145;
        int inverse=0;
        int pos=1;
        while(num>0){
            int d=num%10;
            inverse+=Math.pow(10,d-1)*pos;
            num=num/10;
            pos++;
        }
        System.out.println(inverse);
//        int num=14523;
//        int p=0;
//        int sum=0;
//        while(num!=0){
//            int digit=num%10;
//            sum+=Math.pow(10,p)*digit;
//            p++;
//            num=num/10;
//
//        }
//        System.out.println(sum);
    }
}
