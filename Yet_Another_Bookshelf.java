package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;
/*
 *   @author : Imtiaz Adar
 */
public class Yet_Another_Bookshelf {
    public static void main(String[] args) throws IOException {
        InputStream inputstream = System.in;
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        BufferedReader br = new BufferedReader(inputstreamreader);
        StringTokenizer st = new StringTokenizer("");
        InputReader scan = new InputReader(br, st);
        int n = scan.nextInt();
        while(n-->0)
        {
            StringBuilder sb = new StringBuilder();
            int x = scan.nextInt();
            int [] dp = scan.IntArray(x);
            LinkedList<Integer> dp1 = new LinkedList<>();
            for(Integer it: dp)
                dp1.add(it);
            while(dp1.getLast() == 0)
                dp1.pollLast();
            Collections.reverse(dp1);
            while(dp1.getLast() == 0)
                dp1.pollLast();
            int zeros = 0;
            for(Integer item: dp1)
            {
                if(item == 0)
                    zeros++;
            }
            sb.append(zeros);
            out.println(sb);
            out.flush();
        }
        out.close();
    }

    static class InputReader {
        private BufferedReader readfile;
        private StringTokenizer token;

        InputReader(BufferedReader br, StringTokenizer st)
        {
            this.readfile = br;
            this.token = st;
        }

        String next(){
            while (!this.token.hasMoreTokens()){
                try{
                    token = new StringTokenizer(readfile.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return this.token.nextToken();
        }

        String nextLine() throws IOException {
            return readfile.readLine();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }

        long nextLong(){
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

        String[] StringArray(int size) throws IOException {
            String[] dp = new String[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = token.nextToken();
            }
            return dp;
        }

        int[][] IntArray2d(int size1, int size2) throws IOException {
            int[][] dp = new int[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Integer.parseInt(token.nextToken());
                }
            }
            return dp;
        }

        double[][] DoubleArray2d(int size1, int size2) throws IOException {
            double[][] dp = new double[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Double.parseDouble(token.nextToken());
                }
            }
            return dp;
        }

        long[][] LongArray2d(int size1, int size2) throws IOException {
            long[][] dp = new long[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Long.parseLong(token.nextToken());
                }
            }
            return dp;
        }

        String[][] StringArray2d(int size1, int size2) throws IOException {
            String[][] dp = new String[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = token.nextToken();
                }
            }
            return dp;
        }
    }
}
