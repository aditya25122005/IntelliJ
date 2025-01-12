package recursion_practice;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;  // 0 1 1 2 3 5 8 13 // ans=8
        System.out.println(fibo(n));

    }
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        int ans=fibo(n-1)+fibo(n-2);
        return ans;
    }
}
