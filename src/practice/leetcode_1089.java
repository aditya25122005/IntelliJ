package practice;

public class leetcode_1089 {
    public static void main(String[] args) {
        int [] arr={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(arr);




    }
    public static  void duplicateZeros(int[] arr) {
        int count=0;
        int n=arr.length;

        for(int ele: arr){
            if(ele==0){
                count++;

            }
              }
        for(int i=arr.length-1;i>=0;i--){
            if(i+count<n){
                arr[i+count]=arr[i];
            }

            if(arr[i]==0){
                count--;
                if(i+count<n){
                    arr[i+count]=0;
                }
            }
    }




    }
}
