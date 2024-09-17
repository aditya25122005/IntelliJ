package lec1;

public class array {
    public static void main(String[] args) {
        int [] arr={1,20,45,34,67,3,4,11,8,8,45,67,33,55,20,23};
        int count=0;
        for(int ele:arr){
            if(ele>20) {
                count++;
            }
        }
        int arr2[]=new int[count];
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]<=20){
                continue;
            }
            arr2[j++]=arr[i];
        }
        int sum=0;
for(int i=0;i<arr2.length;i++){
    sum+=arr2[i];
}
System.out.println(sum);

    }
    }
