package Exam;
import java.util.*;
public class paintersPartition {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int B=sc.nextInt();
        int [] arr=new int[B];
        for(int i=0;i<B;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(mintime(arr,P));

    }
    public static int mintime(int [] arr,int P){
        int lo=0;
        int hi=0;
        for(int i=0;i<arr.length;i++){
            lo=Math.max(lo,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            hi+=arr[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(mid,arr,P)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int mid, int [] arr,int P){
        int painter=1;
        int paintedboard=0;
        for(int i=0;i<arr.length;i++){
            if(paintedboard+arr[i]>mid){
                painter++;
                paintedboard=arr[i];
                if(painter>P){
                    return false;
                }
            }
            else{
                paintedboard+=arr[i];

            }
        }
        return true;
    }
}