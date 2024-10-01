package practice;

public class ternaryOperator {
    public static void main(String[] args) {
        int a=30;
        int b=6;
        int c=5;
        int ans= a>b? (a>c? a:c):(b>c? b:c);
        System.out.println(ans);
    }
}
