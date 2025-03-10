package codeforces;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class A_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> negative=new ArrayList<>();
        List<Integer> positive=new ArrayList<>();
        List<Integer> zeroes=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative.add(arr[i]);
            }
            else if(arr[i]>0){
                positive.add(arr[i]);
            }
            else{
                zeroes.add(0);
            }
        }
        List<Integer> set1=new ArrayList<>();
        List<Integer> set2=new ArrayList<>();
        List<Integer> set3=new ArrayList<>();

        set1.add(negative.remove(0));
        if(positive.isEmpty()){
            set2.add(negative.remove(0));
            set2.add(negative.remove(0));
        }
        else{
            set2.addAll(positive);
        }

        set3.addAll(zeroes);
        set3.addAll(negative);
        System.out.print(set1.size()+" ");
        for(int num:set1){
            System.out.print(num+" ");
        }
        System.out.println(set2.size()+" ");
        for(int num:set2){
            System.out.print(num+" ");
        }
        System.out.println(set3.size()+" ");
        for(int num:set3){
            System.out.print(num+" ");
        }


    }
}
