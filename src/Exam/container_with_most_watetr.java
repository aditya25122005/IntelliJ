package Exam;

public class container_with_most_watetr {
    public static void main(String[] args) {
        int [] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] arr) {
        int N=arr.length;
        int left=0;
        int right=N-1;
        int ans=0;

        while(left<right){
            int small=Math.min(arr[left],arr[right]);
            ans=Math.max(small*(right-left),ans);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
            // (arr[left]<=arr[right]) ? left++: right--;
        }
        return ans;

    }
}
