package Exam;

public class length_wise_substring {
    public static void main(String[] args) {
        String s="Aditya";
        substring(s);

    }
    public static void substring(String s){
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){//len=i-j
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
        }

    }
}
