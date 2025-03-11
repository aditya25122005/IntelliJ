package codeforces;
import java.util.*;
public class contest_Mar_11_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<n;i++){
                ll.add(sc.nextInt());
            }
            Collections.sort(ll);
            int ptr=0;
            while(n>1){
                ll.add(ll.get(ptr)+ll.get(ptr+1)-1);
                ptr+=2;
                n--;
            }
            System.out.println(ll.get(ll.size()-1));
        }



    }
}
