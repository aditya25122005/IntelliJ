package codeforces;
import java.util.*;
public class time_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=N;i++) {
            String s = sc.nextLine();
            int A=Integer.parseInt(s.substring(0,2));

            if (A > 12) {
                int t = A - 12;
                System.out.println((t<10? "0"+t:t)+":"+s.substring(3,5)+" PM");


            }
            else if(A==12){
                System.out.println(s.substring(0,5)+" PM");
            }
            else if(A==0){
                System.out.println("12:"+s.substring(3,5)+" AM");
            }
                else {
                System.out.println(s + " AM");
            }
        }

    }
}
