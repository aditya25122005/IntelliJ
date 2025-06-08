package codeforces;
import java.util.*;
    public class CF_contest_may26C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                Map<Integer, Integer> freq = new TreeMap<>();
                for (int x : a) {
                    freq.put(x, freq.getOrDefault(x, 0) + 1);
                }

                int prevNum = -2;
                int openArrays = 0;
                int result = 0;

                for (int num : freq.keySet()) {
                    int count = freq.get(num);
                    if (num == prevNum + 1) {
                        if(count > openArrays) {
                            result += count - openArrays;
                            openArrays = count;
                        } else {
                            openArrays = count;
                        }
                    } else {

                        result += count;
                        openArrays = count;
                    }
                    prevNum = num;
                }

                System.out.println(result);
            }

            sc.close();
        }
    }

