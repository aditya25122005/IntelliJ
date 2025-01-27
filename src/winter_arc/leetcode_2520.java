package winter_arc;

public class leetcode_2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
    }
    public static int countDigits(int num) {
        int val=num;
        int ans=0;
        while(num!=0){
            int rem=num%10;
            if(val%rem==0){
                ans++;
            }
            num/=10;
        }
        return ans;
    }
}
