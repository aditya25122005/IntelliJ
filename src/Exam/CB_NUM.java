package Exam;
import java.util.*;
public class CB_NUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String s=sc.next();
        substring(s);

    }
    public static void substring (String s){
        boolean[] visited=new boolean[s.length()];

        int count=0;
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                String sub=s.substring(i,j);
                if(isCBnum(sub) && isvisited(visited,i,j-1)==true){
                    count++;
                    for(int k=i;k<j;k++){
                        visited[k]=true;
                    }
                }
            }
        }
        System.out.println(count);

    }
    public static boolean isvisited(boolean[] visited,int i,int j){
        for(int k=i;k<=j;k++){
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }
    public static boolean isCBnum(String s){
        long num=Long.parseLong(s);
        if(num==0 || num==1){
            return false;
        }
        int arr[]={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }

        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
