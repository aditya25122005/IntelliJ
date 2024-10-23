package practice;

import java.util.*;

public class book_codekiller{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int N=sc.nextInt();
            int S=sc.nextInt();
            int [] page=new int[N];
            for(int i=0;i<N;i++){
                page[i]=sc.nextInt();
            }
            System.out.println(maxPage(page,S));
        }
    }
    public static int maxPage(int[] page,int S){
        int lo=0;
        int hi=0;
        int ans=0;
        for(int i=0;i<page.length;i++){
            hi+= page[i];
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(isitpossible(page,S,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] page,int S,int mid){
        int student=1;
        int readpage=0;
        int i=0;
        while(i<page.length){
            if(readpage+page[i]<=mid){
                readpage+=page[i];
                i++;
            }
            else{
                student++;
                readpage=0;
            }

            if(student>S){
                return false;
            }
        }
        return true;
    }
}