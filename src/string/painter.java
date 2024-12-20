package string;

import java.util.Scanner;

public class painter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int N=sc.nextInt();
        int [] arr=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(mintime(P,arr));

    }
    public static int mintime(int P,int [] arr){
        int lo=0;
        int hi=0;
        for(int i=0;i<arr.length;i++){
            lo=Math.max(lo,arr[i]);
            hi+=arr[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(mid,P,arr)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
return ans;
    }
    public static boolean isitpossible(int mid,int P,int [] arr){
        int painter=1;
        int paintedboard=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+paintedboard>mid){
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
