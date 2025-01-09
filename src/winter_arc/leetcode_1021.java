package winter_arc;

public class leetcode_1021 {
    public static void main(String[] args) {
        String s="(()())(())";     //()()()
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
            }
            if(count!=1 && s.charAt(i)=='('){
                sb.append("(");
            }
            if(count!=0 && s.charAt(i)==')'){
                sb.append(")");
            }

        }
        System.out.println(sb);
    }

}
