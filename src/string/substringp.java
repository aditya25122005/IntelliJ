package string;

public class substringp {
    public static void main(String[] args) {
        String s="ABCDE";
        int ans=0;
        int l=s.length(); //4
        for(int i=1;i<=s.length();i++){
            ans+= i*l;
            l--;

        }
        System.out.println(ans);

    }
}
