package winter_arc;
import java.util.*;
public class leetcode_2155{
    public static void main(String[] args) {
        int [] arr={0,0,1,0};
        System.out.println(maxScoreIndices(arr));
    }
    public static List<Integer> maxScoreIndices(int[] arr) {
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
        int max=0;

        for(int i=0;i<=n;i++){
            right[i]+=left[i];
            max=Math.max(right[i],max);
        }


        for(int i=0;i<=n;i++){
            if(right[i]==max){
                ll.add(i);
            }
        }
        return ll;
    }
}