package winter_arc;

public class leetcode_3438 {
    public static void main(String[] args) {
        String s="2523533";


        System.out.println(findValidPair(s));

    }
    public static String findValidPair(String s) {

        int [] arr=new int[10];
        StringBuilder ans=new StringBuilder();
        for(int k=0;k<s.length();k++){
            arr[s.charAt(k)-'0']++;
        }
        for(int i=0;i<s.length()-1;i++){
            int d1= s.charAt(i)-'0';
            int d2=s.charAt(i+1)-'0';
            if(d1!=d2 && d1==arr[d1] && d2==arr[d2]){
                ans.append(d1).append(d2);
                break;
            }
        }
        return ans.toString();
    }
}
