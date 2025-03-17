package winter_arc;

public class leetcode_1016 {
    public static void main(String[] args) {
        String s="0110";
        int n=3;
        System.out.println(queryString(s,n));
    }
    public static boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            if(s.indexOf(bin)==-1){
                return false;
            }
        }
        return true;
    }
}
