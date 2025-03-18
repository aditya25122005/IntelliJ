package winter_arc;

public class leetcode_60 {
    public static void main(String[] args) {
        System.out.println(getPermutation(3,1));
    }
    public static String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(i);
        }
        List<String> ll=new ArrayList<>();
        print(sb.toString(),k,"",ll);
        return ll.get(k-1);

    }
    public static void print(String ques,int k,String ans,List<String> ll){
        if(ll.size()==k) return;
        if(ques.isEmpty()){
            ll.add(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String left=ques.substring(0,i);
            String right=ques.substring(i+1);
            print(left+right,k,ans+ch,ll);
        }
    }
}
