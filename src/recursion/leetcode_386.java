package recursion;

public class leetcode_386 {
    public static void main(String[] args) {
        int n=13;
        print(n,0);
    }
    public static void print(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            print(n,curr*10 +i);

        }
    }

}
