package winter_arc;

public class leetcode_1108 {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(!(address.charAt(i)=='.')){
                sb.append(address.charAt(i));
            }
            else{
                sb.append("[.]");
            }
        }
        return sb.toString();

    }
}
