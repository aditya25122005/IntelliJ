package codeforces;

import java.util.Scanner;

public class contest_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int [] arr=new int[n];

            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }

            System.out.println(score(n,k,arr));
        }
    }
    public static int score(int n,int k , int[] arr){
        int [] freq=new int[n+1];
        for(int num:arr){
            freq[num]++;
        }
        int score=0;
        for(int num=1;num<=n;num++){
            if(freq[num]>0){
                int pair=k-num;

                if(pair>=1 && pair<=n){
                    if(num==pair){
                        score+=freq[num]/2;
                    }
                    else if(pair>num && freq[pair]>0){
                        int pairformed=Math.min(freq[num],freq[pair]);
                        score+=pairformed;
                    }
                }
            }
        }
        return score;
    }
}
