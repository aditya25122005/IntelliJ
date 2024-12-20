package Exam;

import java.util.Scanner;

public class aggressivecow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int C=sc.nextInt();
        int N=sc.nextInt();
        int [] stall=new int [N];
        for(int i=0;i<stall.length;i++){
            stall[i]=sc.nextInt();
        }
        System.out.println(mindistance(stall,C));
    }
    public static int mindistance(int[] stall, int C){
        int lo=1;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(mid,C,stall)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int mid,int C,int[] stall){
        int cow=1;
        int pos=stall[0];
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];

                if(cow==C){
                    return true;
                }
            }
        }
        return false;
    }
}
