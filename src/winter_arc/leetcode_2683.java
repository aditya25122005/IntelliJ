package winter_arc;

public class leetcode_2683 {
    public static void main(String[] args) {
        int [] derived={1,1,0};
        System.out.println(doesValidArrayExist(derived));
    }
    public static boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        for(int n:derived){
            sum^=n;
        }
        return sum==0;
    }
}
