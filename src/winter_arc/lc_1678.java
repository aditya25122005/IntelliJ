package winter_arc;

public class lc_1678 {
    public static void main(String[] args) {
        String c="G()(al)";
        System.out.println(interpret(c));
    }
    public static String interpret(String c) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='G'){
                sb.append("G");
            }
            else if(c.charAt(i)=='(' && c.charAt(i+1)==')'){
                sb.append("o");
            }
            else if(c.charAt(i)=='(' && c.charAt(i+1)=='a'){
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
