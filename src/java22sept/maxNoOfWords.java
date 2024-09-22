package java22sept;

public class maxNoOfWords {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(sentences));


    }
    public static int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            int count=cal(sentences[i]);
            if(count>ans){
                ans=count;
            }
        }
        return ans;


    }
    public static int cal(String s){
        int c=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        return c;

    }
}
