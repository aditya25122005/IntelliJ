package codeforces;
import java.util.*;
public class vlad_and_the_best_of5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        for(int t=1;t<=N;t++){
            String s=sc.nextLine();
            int countA=0;
            int countB=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'){
                    countA++;
                }
                else{
                    countB++;
                }
            }
            System.out.println(countA>countB? "A":"B");
        }
    }
}
