package winter_arc;

public class leetcode_3340 {
    public static void main(String[] args) {
        String num = "1234";
        System.out.println(isBalanced(num));
    }

    public static boolean isBalanced(String num) {
        int o = 0;
        int e = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                e += num.charAt(i) - '0';
            } else {
                o += num.charAt(i) - '0';
            }

        }
        return o == e;
    }
}