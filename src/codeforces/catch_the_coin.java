package codeforces;
import java.util.*;
public class catch_the_coin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y<-1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
