package BinarySearch;

public class binary {
    public static void main(String[] args) {
        int [] arr={2,3,4,6,7,9,11,13,17,18,19,20};

        int find=13;
        System.out.println(search(arr,find));

    }
    public static int search(int[] arr,int find){
    int lo=0;
    int hi=arr.length-1;

while(lo<=hi){
    int mid=(lo+hi)/2;
        if(arr[mid]==find){
            return mid;
        }
        else if(arr[mid]>find){
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
    }
return -1;

    }

}
