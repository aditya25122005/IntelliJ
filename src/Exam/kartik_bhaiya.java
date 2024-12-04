package Exam;

public class kartik_bhaiya {
    public static void main(String[] args) {
        String s="abaaabaabbaa";
        int k=2;
        int flipa=Maxlen(s,k,'a');
        int flipb=Maxlen(s,k,'b');
        System.out.println(Math.max(flipa,flipb));

    }
    public static int Maxlen(String s,int k,char ch){
        int ans=0;
        int si=0;
        int ei=0;
        int flip=0;
        while(ei<s.length()){
            //grow
            if(s.charAt(ei)==ch){
                flip++;
            }

            //shrink
            while(flip>k){
                if(s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }

            //update

            ans=Math.max(ei-si+1,ans);
            ei++;
        }
        return ans;
    }
}
