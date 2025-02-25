package codeforces.a;
import java.util.*;
public class con_feb_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            if(k > n*p || k<n*-p){
                System.out.println(-1);
            }
            else{
                int minOperations = (int) Math.ceil((double) Math.abs(k) / p);
                System.out.println(minOperations);
            }
        }

    }
}
