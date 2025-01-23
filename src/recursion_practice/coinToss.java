package recursion_practice;

public class coinToss {
    public static void main(String[] args) {
        int n=3;
        print(n,"");
        System.out.println(count(n,""));

    }
    public static int count(int n, String ans) {
        if (n == 0) {
//            System.out.println(ans);
            return 1;
        }

        int a = 0;
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            a = count(n - 1, ans + "H");
        }
        int b = count(n - 1, ans + "T");
        return a + b;
    }
    public static void print(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!= 'H'){
            print(n-1,ans+"H");
        }
        print(n-1,ans+"T");
    }
}
