package winter_arc;

public class leetcode_2315 {
    public static void main(String[] args) {
        String s="l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }
    public static int countAsterisks(String s) {
        int barcount=0;
        int anscount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                barcount++;
            }
            if(barcount%2==0 && s.charAt(i)=='*'){

                anscount++;

            }

        }
        return anscount;
    }
}
