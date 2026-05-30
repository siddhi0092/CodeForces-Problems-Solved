//Convergence


import java.io.*;
import java.util.*;

public class Prob_2232A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            TreeMap<Long, Integer> sixseven = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());
                sixseven.put(x, sixseven.getOrDefault(x, 0) + 1);
            }

            int left = 0;
            int ans = Integer.MAX_VALUE;

            for (Map.Entry<Long, Integer> e : sixseven.entrySet()) {
                int freq = e.getValue();
                int right = n - left - freq;

                ans = Math.min(ans, Math.max(left, right));

                left += freq;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}