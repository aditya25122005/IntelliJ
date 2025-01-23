package recursion_practice;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        int open=0;
        int close=0;
        print(n,"",open,close);
    }
    public static void print(int n, String ans, int open,int close){
        if(open==n && close==n){
            System.out.println(ans);
            return;
        }
        if(open>n || close>open ){
            return;
        }


        print(n,ans+"(",open+1,close);
        print(n,ans+")",open,close+1);
    }
}
