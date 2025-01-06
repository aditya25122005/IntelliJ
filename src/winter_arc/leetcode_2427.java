package winter_arc;

public class leetcode_2427 {
    public static void main(String[] args) {
        int a=25;
        int b=30;
        System.out.println(commonFactors(a,b));
    }
    public static int commonFactors(int a, int b) {
        int count=1;
        int c=Math.min(a,b);

        for(int i=2;i<=c;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}
