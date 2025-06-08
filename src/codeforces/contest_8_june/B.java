package codeforces.contest_8_june;

import java.util.Scanner;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            List<Integer> ll= new ArrayList<>();
            if(n==3){
                ll.add(2);
                ll.add(3);
                ll.add(1);
            }
            else{
                ll.add(2);
                ll.add(3);
                ll.add(n);
                for(int i=4;i<=n-1;i++){

                    ll.add(i);
                }
                ll.add(1);
            }
            for(int num:ll){
                System.out.print(num+" ");
            }
            System.out.println();

        }
    }
}
