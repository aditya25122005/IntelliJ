package codeforces;
import java.util.*;
public class tales_of_a_sortTLE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int N=sc.nextInt();
            int [] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            if(isSorted(arr)){
                System.out.println(0);
            }
            else {
                while (isSorted(arr)==false) {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = Math.max(0, arr[i] - 1);

                    }
                    count++;
                }
                System.out.println(count);
            }


        }

    }
    public static boolean isSorted(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
