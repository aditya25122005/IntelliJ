package winter_arc;

public class leetcode_476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }

        }
        return Integer.parseInt(sb.toString(),2);
    }
}
