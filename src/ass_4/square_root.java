package ass_4;
import java.util.*;
public class square_root {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int lo=1;
        int hi=N;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(Math.pow(mid,2)==N){
                System.out.println(mid);
                return;
            }
            else if(Math.pow(mid,2)<N){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(ans);

    }
}