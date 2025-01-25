package winter_arc;

public class leetcode_2169 {
    public static void main(String[] args) {
        int num1=2;
        int num2=3;
        System.out.println(countOperations(num1,num2));
    }
    public static int countOperations(int num1, int num2) {
        int ans=0;
        if(num1==0 && num2==0) return 0;
        if(num1==num2) return 1;
        while(num1!=0 && num2!=0){
            if(num1>num2){
                num1-=num2;
                ans++;
            }
            else{
                num2-=num1;
                ans++;
            }
        }
        return ans;
    }
}
