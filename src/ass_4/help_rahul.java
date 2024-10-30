package ass_4;
import java.util.*;
public class help_rahul {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        int t=sc.nextInt();
        System.out.println(index(arr,t));

    }
    public static int index(int [] arr,int t){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==t){
                return mid;
            }

            if(arr[lo]<=arr[mid]){
                if(t>=arr[lo] && t<=arr[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(t>arr[mid] && t<arr[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }

        }
        return -1;
    }
}
