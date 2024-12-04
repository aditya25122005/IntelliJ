package Exam;

public class trapping_rain_water {
    public static void main(String[] args) {
        int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {
        int N=arr.length;
        int left[]=new int[N];
        left[0]=arr[0];
        for(int i=1;i<N;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int right[]=new int[N];
        right[N-1]=arr[N-1];
        for(int i=N-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;


    }
}
