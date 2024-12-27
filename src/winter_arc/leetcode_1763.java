package winter_arc;

public class leetcode_1763 {
    public static void main(String[] args) {
        String s="YazaAay";
        System.out.println(solution(s));
    }
    public static String solution(String s){
        String ans="";
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                String str=s.substring(i,j);
                if(isNice(str)){
                    ans=str.length()>ans.length()? str:ans;
                }
            }
        }
        return ans;
    }
    public static boolean isNice(String str){
        int [] arr=new int[58];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0 && arr[i+32]!=0 || arr[i]!=0 && arr[i+32]==0){
                return false;
            }
        }
        return true;
    }

}
