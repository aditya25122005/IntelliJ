package recursion;

public class permutation2 {
    public static void main(String[] args) {
        String ques="abca";
        print(ques,"");
    }
    public static void print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            if(!isvalid(ques,i+1,ch));
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            print(s1+s2,ans+ch);

        }
    }
    public static boolean isvalid(String str,int i,char ch){

        for(int j=i;j<str.length();j++){
            if(str.charAt(j)==ch){
                return true;   //mil jaye to true
            }
        }
        return false;   //nai mila to false
    }
}