package winter_arc;

public class leetcode_3223 {
    public static void main(String[] args) {
       String s="abaacbcbb";
        System.out.println(minimumLength(s));
    }
    public static int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }
        int ans=0;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }


        for(int i=0;i<arr.length;i++){
            while(arr[i]>=3){
                arr[i]-=2;
            }
        }

        for(int i=0;i<26;i++){
            ans+=arr[i];
        }
        return ans;
    }
}
