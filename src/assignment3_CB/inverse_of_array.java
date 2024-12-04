package assignment3_CB;
import java.util.*;
public class inverse_of_array {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        int [] inverse=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            inverse[arr[i]]=i;
        }
        for(int i=0;i<N;i++){
            System.out.print(inverse[i]+" ");
        }


    }
}
