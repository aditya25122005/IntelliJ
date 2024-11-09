package codeforces;
import java.util.*;
public class boring_apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int x=sc.nextInt();
            int num=x;
            int ans=0;
            int incrementer=1;
            int point=0;
            while(num!=0){
                point=num%10;
                ans+=incrementer;
                incrementer++;
                num=num/10;
            }
            for(int i=1;i<point;i++){
                ans+=10;
            }
            System.out.println(ans);
        }

    }
}
