package winter_arc;

public class leetcode_2379 {
    public static void main(String[] args) {
        String blocks="BBWWWBBWBBBBW";
        int k=7;
        System.out.println(minimumRecolors(blocks,k));
    }
    public static int minimumRecolors(String blocks, int k) {
        int si=0;
        int ei=0;
        int W=0;
        int opr=Integer.MAX_VALUE;
        while(ei<blocks.length()){
            if(blocks.charAt(ei)=='W'){
                W++;
            }
            if(ei-si+1==k){
                opr=Math.min(opr,W);
                if(blocks.charAt(si)=='W'){
                    W--;
                }
                si++;
            }
            ei++;
        }
        return opr;



    }
}
