package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.StringTokenizer;
/*
 *   @author : Imtiaz Adar
 *   Stream : Cholo Arekbar Uri
 */
public class Love_Song {
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        InputStream inputstream = System.in;
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        BufferedReader br = new BufferedReader(inputstreamreader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayReader scan = new ArrayReader(br, st);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String sen = st.nextToken();
        char[] ch = sen.toCharArray();
        int [] dp = new int [n+1];
        dp[0] = 0;
        for(int i=1; i<dp.length; i++)
        {
            dp[i] = dp[i-1]+(ch[i-1]-'a'+1);
        }
        while(x-->0)
        {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int finalres = dp[b]-dp[a-1];
            sb.append(finalres);
            out.println(sb);
            //out.flush();
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
