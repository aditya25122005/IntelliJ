package practice;

public class leetcode_167 {
    public static void main(String[] args) {
        int [] numbers={1,6,4,32};
        int target=7;
        System.out.println(twoSum(numbers,target));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] ans=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<=right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }

        return ans;
    }
}
