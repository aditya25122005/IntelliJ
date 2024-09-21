package java19sept;
import java.util.*;

public class squareOfSortedArray {

        public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int [] arr=new int [N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();

            }

            for(int i=0;i<N;i++){
                arr[i]=arr[i]*arr[i];
            }
            sort(arr,N);
            for(int i=0;i<N;i++){
                System.out.print(arr[i]+" ");
            }


        }
        public static void sort(int [] arr,int N){
            for(int i=0;i<N;i++){
                int idx=min_from_ith_element(arr,i);
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        public static int min_from_ith_element(int [] arr,int i){
            int mini=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            return mini;
    }
}
