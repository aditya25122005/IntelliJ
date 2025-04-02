package winter_arc;
import java.util.*;
public class leetcode_2155{
    public static void main(String[] args) {
        int [] arr={1,1};
        int n=arr.length;
        List<Integer> ll = new ArrayList<>();
        int [] left= new int [n+1];
        int [] right= new int [n+1];
        left[0]=0;
        int zero=0;
        for(int i=1;i<=n;i++){
            if(arr[i-1]==0){
                zero++;
            }
            left[i]=zero;
        }
        int one=0;
        right[n]=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==1){
                one++;
            }
            right[i]=one;
        }
        int sum[] = new int[ n+1];
        for(int i=0;i<=n;i++){
            sum[i]=right[i]+left[i];
            right[i]=right[i]+left[i];
        }
        Arrays.sort(sum);
        int max= sum[n];
        for(int i=0;i<=n;i++){
            if(right[i]==max){
                ll.add(i);
            }
        }
        System.out.println(ll);






    }
}