package java19sept;
import java.util.*;

public class howManyQuestion {

    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int v=0;
        for(int i=1;i<=N;i++){
            int cout=0;
            for(int j=1;j<=3;j++){

                int opt=sc.nextInt();
                if(opt==1){
                    cout++;
                }

            }
            if(cout>=2){
                v++;
            }
        }
        System.out.println(v);

    }
}