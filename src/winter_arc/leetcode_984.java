package winter_arc;

public class leetcode_984 {
    public static void main(String[] args) {
        System.out.println(strWithout3a3b(1,2));
    }
    public static String strWithout3a3b(int a, int b) {
        StringBuilder sb=new StringBuilder();
        while(a>0 || b>0){
            if(a>b && b!=0){
                sb.append("aab");
                a-=2;
                b--;
            }
            else if(b>a && a!=0){
                sb.append("bba");
                b-=2;
                a--;
            }
            else if(b>0){
                sb.append("b");
                b--;
            }
            else{
                sb.append("a");
                a--;
            }
        }
        return sb.toString();
    }
}
