package lec1;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0) System.out.println("even");
        else System.out.println("odd");
    }
}
