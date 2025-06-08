package codeforces;
import java.util.*;
public class CF_Contest_may26A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            String s=sc.next();
            int num=Integer.parseInt(s);
            boolean found=false;
            for(int a=0;a<=99;a++){
                for(int b=0;b<=99;b++){
                    int sum=a+b;
                    if(sum*sum==num){
                        System.out.println(a+" "+b);
                        found=true;
                        break;
                    }
                }
                if(found) break;
            }
            if(!found){
                System.out.println(-1);
            }
        }
    }
}
