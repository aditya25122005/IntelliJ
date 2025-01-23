package recursion_practice;

public class permutations {
    public static void main(String[] args) {
        String s="abc";
        print(s,"");
    }
    public static void print(String s,String ans) {
        if(s.length()==0){
            System.out.println(ans);;;;
            return;
        }

        for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        String s1=s.substring(0,i);
        String s2=s.substring(i+1);
        String so=s1+s2;
        if(check(i+1,s.length(),s,ch)){
            print(s1+s2,ans+ch);
            }

        }
    }
    public static boolean check(int start, int end,String s, char ch){
        for(int i=start;i<end;i++){
            if(s.charAt(i)==ch){
                return false;
            }
        }
        return true;
    }
}
