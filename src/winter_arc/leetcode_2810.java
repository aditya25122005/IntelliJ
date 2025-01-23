package winter_arc;

public class leetcode_2810 {
    public static void main(String[] args) {
        System.out.println("string");
    }
    public static String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='i'){
                sb.append(ch);
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
