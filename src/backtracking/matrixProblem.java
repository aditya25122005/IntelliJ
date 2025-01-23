package backtracking;

public class matrixProblem {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int currRow=0;
        int currCol=0;
        print(m-1,n-1,currRow,currCol,"");
        System.out.println(count(m-1,n-1,currRow,currCol,""));

    }
    public  static void print(int er,int ec,int cr, int cc, String ans){
        if(cc==ec && cr==er){
            System.out.println(ans);
            return;
        }
        if(cc>ec || cr>er){
            return;
        }
        print(er,ec,cr+1,cc,ans+"H");
        print(er,ec,cr,cc+1,ans+"V");
    }

    public  static int count(int er,int ec,int cr, int cc, String ans){
        if(cc==ec && cr==er){
//            System.out.println(ans);
            return 1;
        }
        if(cc>ec || cr>er){
            return 0;
        }
        int a;
        int b;
         a=count(er,ec,cr+1,cc,ans+"H");
         b=count(er,ec,cr,cc+1,ans+"V");
        return a+b;
    }
}
