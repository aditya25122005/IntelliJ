package recursion_practice;

public class decreasing {
    public static void main(String[] args) {
        int n=5;
        decreasing(n);

    }
    public static void decreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);

    }
}
