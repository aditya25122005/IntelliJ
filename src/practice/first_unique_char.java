package practice;

public class first_unique_char {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));

    }
    public static int firstUniqChar(String s) {
        int [] freq =new int [26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

}

//        String s="loveleetcode";
//        for(int i=0;i<s.length();i++){
//            if(isunique(s.charAt(i),s)){
//                System.out.println(i);
//                break;
//            }
//        }
    //}
//    public static boolean isunique(char c,String s){
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==c){
//                count++;
//            }
//        }
//        if(count>1){
//            return false;
//        }
//        return true;
//
//    }
//}
