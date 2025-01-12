package winter_arc;

public class leetcode_2116 {
    public static void main(String[] args) {
        String s="))()))";
        String locked="010100";
        System.out.println(canBeValid(s,locked));
    }
    public static boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(s.length()%2==1){
            return false;
        }
        int balance=0;
        int flexibility=0;
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                flexibility++;
            }
            else if(s.charAt(i)=='('){
                balance++;
            }
            else{
                balance--;
            }
            if(balance+flexibility < 0) return false;

        }

        balance=0;
        flexibility=0;
        for(int i=n-1;i>=0;i--){
            if(locked.charAt(i)=='0'){
                flexibility++;
            }
            else if(s.charAt(i)==')'){
                balance++;
            }
            else{
                balance--;
            }
            if(flexibility+balance<0) return false;
        }


        return true;
    }
}
