package practice;

public class leetcode_434 {
    public static void main(String[] args) {
        String s="Hello, my name is John";
        System.out.println(countSegments(s));

    }
    public static int countSegments(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        String[] arr=s.split(" +");

        return arr.length;

    }
}
