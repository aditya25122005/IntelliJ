package codeforces;
import java.util.*;

public class rook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();

       for(int i=1;i<=N;i++){

           String s=sc.nextLine();
           for(int l=1;l<=8;l++){
               if(l== Integer.parseInt(s.substring(1,2))){
                  continue;
               }
               else{
                    char ch1=s.charAt(0);
                   System.out.println(ch1+""+l);
               }
           }

           for(int j=97;j<105;j++){
               int ch=(int)s.charAt(0);
                if(j!=ch){
                    char c=(char)j;

                    System.out.println(c+""+s.charAt(1));
                }
           }

       }


    }

}
