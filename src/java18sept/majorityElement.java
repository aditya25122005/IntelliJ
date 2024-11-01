package java18sept;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(moorevoting(nums));
    }
    public static  int  moorevoting(int [] nums){
        int e= nums[0];
        int v=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==e){
                v++;
            }
            else{
                v--;
                if(v==0){
                    e=nums[i];
                    v=1;
                }
            }
        }
        return e;
                         // random
    }
}
