package codeforces.a;

import java.util.Scanner;

public class next_round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=arr[k-1] && arr[i] !=0){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
