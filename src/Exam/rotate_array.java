package Exam;

public class rotate_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }

    }
    public static void reverse( int []arr,int i,int j){
while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}



    }
}
