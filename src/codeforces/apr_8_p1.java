package codeforces;
import java.util.*;
public class apr_8_p1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int k=sc.nextInt();
            if(k%2==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
