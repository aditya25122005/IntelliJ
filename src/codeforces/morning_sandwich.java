package codeforces;
import java.util.*;
public class morning_sandwich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int h = sc.nextInt();
            if (c + h + 1 == b) {
                System.out.println(b + c + h);
            } else if (b < c + h + 1) {
                System.out.println(b + b - 1);
            } else {
                System.out.println(c + h + c + h + 1);
            }
        }
    }
}
