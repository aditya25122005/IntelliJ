package winter_arc;

public class leetcode_1588 {
    public static void main(String[] args) {
        int [] arr={1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static  int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        int [] prefix=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int size=j-i+1;
                if(size%2==1){
                    prefix[size]+= sum(arr,i,j);
                }
            }
        }
        for(int e:prefix){
            ans+=e;
        }
        return ans;

    }
    public static int sum(int [] arr,int start, int end){
        int res=0;
        for(int i=start;i<=end;i++){
            res+=arr[i];
        }
        return res;
    }
}
