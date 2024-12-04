package Exam;
import java.util.*;
public class murthal_Paratha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int l=sc.nextInt();
        int [] R=new int[l];
        for(int i=0;i<l;i++){
            R[i]=sc.nextInt();
        }
        int ans=0;
        Arrays.sort(R);
        int lo=1;
        int hi=R[0] * P*(P-1);
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int total=0;
            for(int r:R){
                int count=0;
                int time=0;
                while(time+(count+1)*r<=mid){
                    count++;
                    time+=count*r;
                }
                total+=count;
                if(total>P){
                    break;
                }
            }
            if(total>=P){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(ans);
    }
}
