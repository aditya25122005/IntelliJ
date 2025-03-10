package winter_arc;

public class leetcode_2833 {
    public static void main(String[] args) {
        String moves="L_RL__R";
        System.out.println(furthestDistanceFromOrigin(moves));
    }
    public static int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int ans=0;
        int left=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L' || moves.charAt(i)=='_'){
                left--;
            }
            else{
                left++;
            }
        }
        int right=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R' || moves.charAt(i)=='_'){
                right++;
            }
            else{
                right--;
            }
        }
        ans=Math.max(Math.abs(left),Math.abs(right));
        return ans;

    }
}
