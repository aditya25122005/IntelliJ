package ass_4;

import java.util.*;
public class motivational_speech {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean res=true;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i<j && arr[i][j]!=0){
                    res=false;
                }
            }
        }
        System.out.println(res);

    }
}