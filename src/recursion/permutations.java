package recursion;

public class permutations {
    public static void main(String[] args) {
        String ques="abbc";
        print(ques,"");
    }
    public static void print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            print(s1+s2,ans+ch);

        }
    }
}
