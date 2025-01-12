package recursion_practice;

public class print_fibonacci {
    public static void main(String[] args) {
        int n=6;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        print(n-2,a,b);

    }
    public static void print(int n, int a,int b){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        print(n-1,b,c);

    }
}
