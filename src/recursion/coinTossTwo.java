package recursion;

public class coinTossTwo {
    public static void main(String[] args) {
        int n=1;
        CoinToss(n, "");
    }
    public static void CoinToss(int n,String ans){
        if(n==0){

            System.out.println(ans);
            return;
        }
        if(ans.length()==0 ||ans.charAt(ans.length()-1) !='0'){
            CoinToss(n-1,ans+"0");
        }
        CoinToss(n-1,ans+"1");

    }
}
