package java22sept;
import java.util.*;
public class targetPairWithoutHashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        int trgt=sc.nextInt();
        bubbleSort(arr);
        int left=0;
        int right=N-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==trgt){
                System.out.println(arr[left]+" and "+arr[right]);

                left++;
                right--;
                while(left<right && arr[left]==arr[left-1]){
                    left++;
                }

                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }


            }
            else if(sum<trgt){
                left++;
            }
            else{
                right--;
            }
        }

    }
    public static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int turn=1;turn<n;turn++){
            for(int i=0;i<n-turn ;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
}
