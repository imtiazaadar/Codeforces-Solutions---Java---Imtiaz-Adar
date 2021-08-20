package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Omkar_And_Infinity_Clock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer(br.readLine());
        ArrayReader scan = new ArrayReader(br, token);
        int T = Integer.parseInt(token.nextToken());
        while(T-- > 0)
        {
            StringBuilder sb = new StringBuilder();
            token = new StringTokenizer(br.readLine());
            long x = Long.parseLong(token.nextToken());
            long y = Long.parseLong(token.nextToken()) % 2;
            if(y == 0)
                y = 2;
            long[] dp = scan.LongArray((int)x);
            for(int i = 0; i < y; i++)
            {
                Long maximum = dp[0];
                for(Long item : dp)
                {
                    maximum = Math.max(maximum, item);
                }
                for(int j = 0; j < dp.length; j++)
                    dp[j] = maximum - dp[j];
            }
            for(int i = 0; i < dp.length; i++)
                sb.append(dp[i] + " ");
            out.println(sb);
            out.flush();
        }
        out.close();
    }
    static class ArrayReader {
        private BufferedReader readfile;
        private StringTokenizer token;

        ArrayReader(BufferedReader br, StringTokenizer st)
        {
            this.readfile = br;
            this.token = st;
        }
        int[] IntArray(int size) throws IOException {
            int[] dp = new int[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Integer.parseInt(token.nextToken());
            }
            return dp;
        }
        double[] DoubleArray(int size) throws IOException {
            double[] dp = new double[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Double.parseDouble(token.nextToken());
            }
            return dp;
        }
        long[] LongArray(int size) throws IOException {
            long[] dp = new long[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Long.parseLong(token.nextToken());
            }
            return dp;
        }
    }
}
