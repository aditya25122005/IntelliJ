package codeforces.a;
import java.util.*;
public class feb_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++) {


            int n = sc.nextInt();
            String s = sc.next();
            long countdash = 0;
            long countunder = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '-') {
                    countdash++;
                } else {
                    countunder++;
                }
            }
            System.out.println((countdash / 2) * countunder * (countdash - (countdash / 2)));
        }
    }
}
