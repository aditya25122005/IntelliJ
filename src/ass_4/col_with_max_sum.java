package ass_4;
import java.util.*;
public class col_with_max_sum {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        int maxsum=Integer.MIN_VALUE;


        int minc=0;
        int anscol=0;
        int minr=0;
        int maxc=N-1;
        int maxr=N-1;
        for(int j=1;j<=N;j++){
            int currsum=0;

            for(int i=minr;i<=maxr;i++){

                currsum+=arr[i][minc];
                // maxsum=Math.max(maxsum,currsum);
                if(currsum>=maxsum){
                    maxsum=currsum;
                    anscol=minc;
                }
            }

            minc++;

        }
        System.out.println(anscol+1+" "+maxsum);


    }
}