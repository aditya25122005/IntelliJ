package Exam;
import java.util.*;
public class running_sum {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int [N];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int prevSum=0;
        for(int i=0;i<N;i++){
            System.out.print(prevSum+arr[i]+" ");
            prevSum+=arr[i];
        }


    }
}