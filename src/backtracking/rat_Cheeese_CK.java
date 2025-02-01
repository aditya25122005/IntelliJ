package backtracking;
import java.util.*;
public class rat_Cheeese_CK {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[] [] mat=new char[n][m];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++){
                mat[i][j]=s.charAt(j);
            }
        }
        int [] [] ans=new int[n][m];
        print(mat,0,0,ans);
    }
    static boolean val=false;
    public static void print(char[][]mat,int cr,int cc,int [][] ans){
        if(cr<0 || cc<0 || cr>=mat.length || cc>=mat[0].length || mat[cr][cc]=='X') {
            return;
        }
        if(cr==mat.length-1 && cc==mat[0].length-1){
            ans[cr][cc]=1;
            val=true;
            display(ans);
        }
        mat[cr][cc]='X';
        ans[cr][cc]=1;
            print(mat, cr - 1, cc,ans);
            print(mat, cr, cc - 1,ans);
            print(mat, cr + 1, cc,ans);
            print(mat, cr, cc + 1,ans);
            mat[cr] [cc]='0';
            ans[cr][cc]=0;


    }
    public static void display(int [] [] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}