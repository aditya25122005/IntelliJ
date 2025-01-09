package recursion;

public class fibo {
    public static void main(String[] args) {
        int n=8;
        System.out.println(f(n));

    }
    public static int f(int n){
        if(n<=1){
            return n;
        }
        int f1=f(n-1);
        int f2=f(n-2);
        return f1+f2;
    }
}
