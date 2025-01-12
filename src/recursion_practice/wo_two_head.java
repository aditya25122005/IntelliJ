package recursion_practice;

public class wo_two_head {
    public static void main(String[] args) {
        int n=3 ;
        String ans="";
        Toss(n,ans);
    }
    public static void Toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if( ans.length()==0 ||ans.charAt((ans.length())-1) != 'H') {
            Toss(n - 1, ans + "H");
        }
        Toss(n-1,ans+"T");
    }
}
