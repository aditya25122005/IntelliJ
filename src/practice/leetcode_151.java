package practice;

public class leetcode_151 {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        String ans = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            ans = ans.concat(arr[i] + " ");
        }
        return ans.trim();
    }

    }
