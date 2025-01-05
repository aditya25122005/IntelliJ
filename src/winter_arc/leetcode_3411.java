package winter_arc;

public class leetcode_3411 {
    public static void main(String[] args) {
    int[] nums={1,2,1,2,1,1,1};
    int ans=0;
    for(int i=0;i<nums.length;i++){
        int g=nums[i];
        int l=nums[i];
        int p=nums[i];
        for(int j=i+1;j<nums.length;j++){
            g=gcd(g,nums[j]);
            l=lcm(l,nums[j]);
            p*=nums[j];
            if(p==g*l){
                ans=Math.max(ans,j-i+1);
            }
        }

    }
        System.out.println(ans);


    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

    }

    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }


}
