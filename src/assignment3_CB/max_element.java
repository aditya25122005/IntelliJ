package assignment3_CB;
import java.util.*;
public class max_element {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];

        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);


    }
}
