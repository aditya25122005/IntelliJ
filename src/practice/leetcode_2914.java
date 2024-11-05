package practice;

public class leetcode_2914 {
    public static void main(String[] args) {
        String s="1001";
        System.out.println(minChanges(s));

    }

        public static  int minChanges(String s) {
            int counter =0;
            for(int i=0;i<s.length()-1;i+=2){
                if(s.charAt(i) != s.charAt(i+1)){
                    counter++;

                }
            }
            return counter;

        }

}
