package recursion_practice;

public class diceproblem {
    public static void main(String[] args) {
        int n=4;
        print(n,0,"");
        System.out.println(count(n,0,""));
    }
    public static int count(int n, int curr,String ans){
        if(curr==n){
//            System.out.println(ans);
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int count=0;
        for(int dice=1;dice<=3;dice++){
           count += count(n,curr+dice,ans+dice);
        }
        return count;
//        print(n,curr+1,ans+1);
//        print(n,curr+2,ans+2);
//        print(n,curr+3,ans+3);
    }
    public static void print(int n, int curr,String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        for(int dice=1;dice<=3;dice++){
            print(n,curr+dice,ans+dice);
        }
//        print(n,curr+1,ans+1);
//        print(n,curr+2,ans+2);
//        print(n,curr+3,ans+3);
    }

}
