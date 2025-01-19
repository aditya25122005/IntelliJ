package winter_arc;

public class leetcode_2109 {
    public static void main(String[] args) {
        String s="LeetcodeHelpsMeLearn";
        int [] spaces={8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        int idx=0;
        int space=spaces[idx];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(idx<spaces.length){
                space=spaces[idx];
            }
            if(i==space){
                sb.append(" ");
                idx++;

            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
