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
 *   Stream : Ami Tomar Moner Bhetor
 */
public class Domino_On_Windowsill {
    static final long mod = 1000000007L;
    public static void main(String[] args) throws IOException {
        InputStream inputstream = System.in;
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        BufferedReader br = new BufferedReader(inputstreamreader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayReader scan = new ArrayReader(br, st);
        int n = Integer.parseInt(st.nextToken());
        while(n-->0)
        {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(b+c>=x*2 && ((a-b)+(a-c))>=y*2)
                sb.append("YES");
            else
                sb.append("NO");
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
            this.token = new StringTokenizer(this.readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Integer.parseInt(this.token.nextToken());
            }
            return dp;
        }

        double[] DoubleArray(int size) throws IOException {
            double[] dp = new double[size];
            this.token = new StringTokenizer(this.readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Double.parseDouble(this.token.nextToken());
            }
            return dp;
        }

        long[] LongArray(int size) throws IOException {
            long[] dp = new long[size];
            this.token = new StringTokenizer(this.readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Long.parseLong(this.token.nextToken());
            }
            return dp;
        }

        String[] StringArray(int size) throws IOException {
            String[] dp = new String[size];
            this.token = new StringTokenizer(this.readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = this.token.nextToken();
            }
            return dp;
        }

        int[][] IntArray2d(int size1, int size2) throws IOException {
            int[][] dp = new int[size1][size2];
            for (int i = 0; i < size1; i++) {
                this.token = new StringTokenizer(this.readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Integer.parseInt(this.token.nextToken());
                }
            }
            return dp;
        }

        double[][] DoubleArray2d(int size1, int size2) throws IOException {
            double[][] dp = new double[size1][size2];
            for (int i = 0; i < size1; i++) {
                this.token = new StringTokenizer(this.readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Double.parseDouble(this.token.nextToken());
                }
            }
            return dp;
        }

        long[][] LongArray2d(int size1, int size2) throws IOException {
            long[][] dp = new long[size1][size2];
            for (int i = 0; i < size1; i++) {
                this.token = new StringTokenizer(this.readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Long.parseLong(this.token.nextToken());
                }
            }
            return dp;
        }

        String[][] StringArray2d(int size1, int size2) throws IOException {
            String[][] dp = new String[size1][size2];
            for (int i = 0; i < size1; i++) {
                this.token = new StringTokenizer(this.readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = this.token.nextToken();
                }
            }
            return dp;
        }
    }
}
