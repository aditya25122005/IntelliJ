package BinarySearch;

public class rotated_sorted_array {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,1,2,3};
        int target=2;
        System.out.println(search(arr,target));


    }
    public static int search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[mid]>=arr[lo]){
                if(arr[mid]>=target && arr[lo]<=target){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && arr[hi]>=target){
                    lo=mid=1;
                }
                else{
                    hi=mid-1;
                }
            }

        }
        return -1;

    }
}
