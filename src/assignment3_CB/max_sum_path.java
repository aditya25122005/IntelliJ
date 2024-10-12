package assignment3_CB;
import java.util.*;
public class max_sum_path {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){

            int n=sc.nextInt();
            int m=sc.nextInt();
            int [] arr1=new int[n];
            int [] arr2=new int[m];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for (int i=0;i<m;i++){
                arr2[i]=sc.nextInt();
            }

            System.out.println(maxSumPath(arr1,arr2,n,m));



        }

    }
    public static int maxSumPath(int arr1[] ,int [] arr2,int n,int m){
        int i=0;
        int j=0;
        int sum1=0;
        int sum2=0;
        int result=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                sum2+=arr2[j++];
            }
            else{
                result+=Math.max(sum1,sum2)+arr1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }

        }
        while(i<n){
            sum1+=arr1[i++];
        }
        while(j<m){
            sum2+=arr2[j++];
        }
        result+=Math.max(sum1,sum2);
        return result;
    }
}
