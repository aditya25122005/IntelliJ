package codeforces;

import java.util.Scanner;

public class mar_23_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int total = a * 2 + 1; // Equivalent to a + 0.5 in integer form

            if (x * 2 >= total) {
                System.out.println("NO"); // Little B can dig alone
            } else if ((x + y) * 2 >= total) {
                System.out.println("YES"); // They can finish in one cycle
            } else {
                int remainingDepth = total - 2 * x;
                int cycles = (remainingDepth + x + y - 1) / (x + y); // Equivalent to ceil without floating point

                if (cycles % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
