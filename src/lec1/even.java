package lec1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0) System.out.println("even");
        else System.out.println("odd");

        char arr[]={'a','u','e','E'};
        Arrays.sort(arr);
        for(char ch:arr){
            System.out.println(ch);
        }
    }
}
