package codeforces;
import java.util.*;
public class mar_25_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Integer [] arr=new Integer[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr,Collections.reverseOrder());
            int team=0;
            int member=0;
            int minSkill=Integer.MAX_VALUE;
            for(int skill:arr){
                member++;
                minSkill=Math.min(minSkill,skill);
                if(member*minSkill>=x){
                    team++;
                    member=0;
                    minSkill=Integer.MAX_VALUE;
                }
            }
            System.out.println(team);
        }
    }
}
