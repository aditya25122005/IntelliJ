package string;

public class printAllSubstrings {
    public static void main(String[] args) {
        String s="aditya";
        PrintSubstring(s);
    }
    public static void PrintSubstring(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }

    }
}
