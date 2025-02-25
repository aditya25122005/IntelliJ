package Divide_and_Conquer;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr1={2,3,5,7,9};
        int [] arr2={1,2,5,7,9,11,13,15,18};
        int n=arr1.length;
        int m=arr2.length;
        int [] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;

            }
        }
        while(i<n){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        for(int val:ans){
            System.out.print(val+" , ");
        }

    }
}
