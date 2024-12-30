package winter_arc;

public class leetcode_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int i=1;
        while(i<=n){
            n=n-i;
            i++;

        }
        return i-1;
    }
}
