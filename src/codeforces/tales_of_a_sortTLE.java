package codeforces;
import java.util.*;
public class tales_of_a_sortTLE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int N=sc.nextInt();
            int [] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();

            }

            int c=0;
            for(int i=1;i<N;i++){
                if(arr[i]<arr[i-1]){
                    c=Math.max(c,arr[i-1]);
                }
            }
            System.out.println(c);
        }
    }
}
// 3 1 5 6 8