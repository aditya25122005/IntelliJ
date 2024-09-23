package java22sept;
import java.util.*;

public class targetPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        int trgt=sc.nextInt();
        HashSet h=new HashSet<>();

        for(int i=0;i<N;i++){
            int complement=trgt-arr[i];
            if(h.contains(complement)){
                if(arr[i]<complement){
                    System.out.println(arr[i]+"and"+complement);
                }
                else{
                    System.out.println(complement+"and"+arr[i]);
                }
            }
            h.add(arr[i]);
        }
    }
}
