package java19sept;

public class sorting {
    public static void main(String[] args) {
        //bubble, selection,Insertion,

        int [] arr={1,23,34,15,67,34,90,4};
        bubbleSort(arr);
        print(arr);
    }
    public static void bubbleSort(int[] arr){
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
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
