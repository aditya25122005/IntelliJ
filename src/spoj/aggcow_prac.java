package spoj;
import java.util.*;
public class aggcow_prac {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int C=sc.nextInt();
            int [] stall=new int[N];
            for(int i=0;i<N;i++){
                stall[i]=sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(maxMindistance(stall,C));

        }


    }
    public static int maxMindistance(int[] stall,int C){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(isitpossible(stall,mid,C)){
                ans=mid;
                lo=mid+1;

            }
            else{
                hi=mid-1;
            }
        }
        return ans;

    }
    public static boolean isitpossible(int[] stall,int mid,int C){
        int pos=stall[0];
        int count=1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
            count++;
            pos=stall[i];
            }
            if(count==C){
                return true;
            }
        }
        return false;
    }
}