package codeforces;
import java.util.*;
public class mar_17_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            long n=sc.nextInt();
            long k=sc.nextInt();
            long opr=0;

                if(n%2==0){
                    opr = (n + (k - 2)) / (k - 1);

                }
                else{
                   opr=1;
                   n-=k;
                    opr += (n + (k - 2)) / (k - 1);
                }



            System.out.println(opr);

        }

    }

}
