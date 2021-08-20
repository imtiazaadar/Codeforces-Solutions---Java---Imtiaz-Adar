package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Candies {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer("");
        InputReader scan = new InputReader(input, tokenizer);
        int cases = scan.nextInt();
        while(cases-- > 0)
        {
            StringBuilder sb = new StringBuilder();
            long cand = scan.nextLong();
            for(int i = 2; i < cand; i++)
            {
                long value = (1 << i) - 1;
                if(cand % value == 0)
                {
                    sb.append(cand / value);
                    break;
                }
            }
            out.println(sb);
            out.flush();
        }
        out.close();
    }

    static class InputReader {
        private BufferedReader readfile;
        private StringTokenizer token;

        InputReader(BufferedReader br, StringTokenizer st) {
            this.readfile = br;
            this.token = st;
        }

        String next() {
            while (!this.token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(readfile.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.token.nextToken();
        }

        String nextLine() throws IOException {
            return readfile.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int[] IntArray(int size) throws IOException {
            int[] dp = new int[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Integer.parseInt(token.nextToken());
            }
            return dp;
        }
    }
}
