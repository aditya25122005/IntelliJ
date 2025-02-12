package winter_arc;

public class leetcode_1694 {
    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
    }
    public static String reformatNumber(String number) {
    StringBuilder sb=new StringBuilder();
        for(int i=0;i<number.length();i++){
        if(number.charAt(i)!=' ' && number.charAt(i) !='-'){
            sb.append(number.charAt(i));
        }
    }
    String s=sb.toString();
    StringBuilder res=new StringBuilder();
    int i=0;
    int n=sb.length();
        while(n-i > 4){
        res.append(s.substring(i,i+3)).append("-");
        i+=3;
    }
        if(n-i == 4){
        res.append(s.substring(i,i+2)).append("-").append(s.substring(i+2,i+4));
    }
        else{
        res.append(s.substring(i));
    }

        return res.toString();

}
}
