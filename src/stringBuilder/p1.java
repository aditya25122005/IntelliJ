package stringBuilder;
import java.util.*;
public class p1 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for(int i=N-1;i>=0;i--){
            int num=sc.nextInt();
            sum+=Math.pow(10,i) * num;
        }
        int M=sc.nextInt();
        int sum2=0;
        for(int i=M-1;i>=0;i--){
            int num=sc.nextInt();
            sum2+=Math.pow(10,i) * num;
        }

        int tsum=sum+sum2;
        String str=String.valueOf(tsum);
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+", ");
        }
        System.out.print("END");


    }
}
