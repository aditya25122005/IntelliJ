package Exam;

import java.util.*;
public class Emilys_Birthday_CB_7019 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(isthere(arr,arr[i],i)){
                System.out.println(arr[i]);
                break;
            }
        }


    }
    public static boolean isthere(int [] arr,int ele,int i){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==ele){
                return true;
            }
        }
        return false;
    }
}