package Exam;
import java.util.*;
public class bookAllocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int S=sc.nextInt();
        int pages[]=new int[N];
        for(int i=0;i<N;i++){
            pages[i]=sc.nextInt();
        }
        System.out.println(maxpage(S,pages));
    }
    public static int maxpage(int S,int [] pages){
        int lo=0;
        int hi=0;
        for(int i:pages){
            hi+=i;
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(mid,S,pages)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int mid,int S,int[] pages){
        int readpage=0;
        int student=1;
        int i=0;
        while (i<pages.length){
            if(readpage+pages[i]<=mid){
                readpage+=pages[i];
                i++;
            }
            else{
                student++;
                readpage=0;

                if(student>S){
                    return false;
                }
            }
        }
        return true;
    }
}
