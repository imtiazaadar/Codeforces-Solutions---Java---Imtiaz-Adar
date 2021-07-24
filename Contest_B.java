package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/*
 *   @author : Imtiaz Adar
 */
public class Contest_B {
    public static void main(String[] args) throws IOException {
        ArrayReader scan = new ArrayReader();
        InputStream inputstream = System.in;
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        BufferedReader br = new BufferedReader(inputstreamreader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            char[] s = st.nextToken().toCharArray();
            if(s.length<2)
            {
                sb.append("0");
            }
            else {
                Map<Character, Integer> map = new HashMap<Character, Integer>();
                int dd = 0;
                for (int i = 0; i < s.length; i++) {
                    if (map.containsKey(s[i])) {
                        map.replace(s[i], map.get(s[i]) + 1);
                    } else {
                        map.put(s[i], 1);
                    }
                    if (map.get(s[i]) <= 2) {
                        dd++;
                    }
                }
                sb.append(dd / 2);
            }
            out.println(sb);
        }
        out.close();
    }

    static class ArrayReader {
        int[] IntArray(int size, BufferedReader br, StringTokenizer st) throws IOException {
            int[] dp = new int[size];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Integer.parseInt(st.nextToken());
            }
            return dp;
        }

        double[] DoubleArray(int size, BufferedReader br, StringTokenizer st) throws IOException {
            double[] dp = new double[size];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Double.parseDouble(st.nextToken());
            }
            return dp;
        }

        long[] LongArray(int size, BufferedReader br, StringTokenizer st) throws IOException {
            long[] dp = new long[size];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Long.parseLong(st.nextToken());
            }
            return dp;
        }

        String[] StringArray(int size, BufferedReader br, StringTokenizer st) throws IOException {
            String[] dp = new String[size];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = st.nextToken();
            }
            return dp;
        }

        int[][] IntArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException {
            int[][] dp = new int[size1][size2];
            for (int i = 0; i < size1; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            return dp;
        }

        double[][] DoubleArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException {
            double[][] dp = new double[size1][size2];
            for (int i = 0; i < size1; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Double.parseDouble(st.nextToken());
                }
            }
            return dp;
        }

        long[][] LongArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException {
            long[][] dp = new long[size1][size2];
            for (int i = 0; i < size1; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = Long.parseLong(st.nextToken());
                }
            }
            return dp;
        }

        String[][] StringArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException {
            String[][] dp = new String[size1][size2];
            for (int i = 0; i < size1; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < size2; j++) {
                    dp[i][j] = st.nextToken();
                }
            }
            return dp;
        }
    }
}
