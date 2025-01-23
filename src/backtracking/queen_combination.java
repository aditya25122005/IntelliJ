package backtracking;

public class queen_combination {
        public static void main(String[] args) {
        int n=4;
        int tq=2;  //total queen
        boolean [] board =new boolean[n];
        comb(board,tq,"" ,0,0);
    }

    public static void comb (boolean[] board, int tq, String ans, int qpsf,int idx){
        if(qpsf==tq){
            System.out.println(ans);
            return;//Queen placed so far
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]!=true){
                board[i]=true;
                comb(board, tq, ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
                board[i]=false;
            }

        }
    }
}
