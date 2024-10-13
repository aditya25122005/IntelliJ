package assignment3_CB;
import java.util.*;

public class von_neuman_binary {

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            for(int i=1;i<=N;i++){
                int n=sc.nextInt();
                int decimal=0;
                int mul=0;
                while(n!=0){

                    int digit=n%10;
                    decimal+= digit*Math.pow(2,mul);
                    mul++;
                    n=n/10;
                }
                System.out.println(decimal);

            }


        }
}
