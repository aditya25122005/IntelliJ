package winter_arc;

public class leetcode_1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
    public static int tribonacci(int n) {
        if(n<3){
            if(n==0) return 0;
            else return 1;

        }
        int t0=0;
        int t1=1;
        int t2=1;
        int tn=0;

        for(int i=3;i<=n;i++){
            tn=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=tn;
        }
        return tn;
    }
}
