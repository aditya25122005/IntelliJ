package backtracking;

public class queenPermutations {
    public static void main(String[] args) {
        int n=4;
        int tq=2;  //total queen
        boolean [] board =new boolean[n];
        Permutation(board,tq,"" ,0);
    }
    public static void Permutation (boolean[] board, int tq, String ans, int qpsf){
        if(qpsf==tq){
            System.out.println(ans);
            return;//Queen placed so far
        }
        for(int i=0;i<board.length;i++){
            if(board[i]!=true){
                board[i]=true;
                Permutation(board, tq, ans+"b"+i+"q"+qpsf,qpsf+1);
                board[i]=false;
            }

        }
    }
}
