package recursion_practice;

public class tossCoin {
    public static void main(String[] args) {
        int n=3;
        String ans="";
        Toss(n,ans);
        System.out.println(countToss(n,ans));
    }
    public static int countToss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }
        int a=countToss(n-1,ans+"H");
       int b= countToss(n-1,ans+"T");
       return a+b;

    }
    public static void Toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        Toss(n-1,ans+"H");
        Toss(n-1,ans+"T");
    }
}
