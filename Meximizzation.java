package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
/*
 *   @author : Imtiaz Adar
 */
public class Meximizzation {
    public static void main(String[] args) throws IOException {
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        InputStream inputstream = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int[] dp = IntArray(x, br, st);
            ArrayList<Integer> dp1 = new ArrayList<Integer>();
            ArrayList<Integer> dp2 = new ArrayList<Integer>();
            StringBuilder sb = new StringBuilder();
            for(Integer it: dp){
                dp1.add(it);
            }
            Collections.sort(dp1);
            for(int i=0; i<dp1.size(); i++){
                if(i>0 && dp1.get(i)==dp1.get(i-1))
                {
                    continue;
                }
                else {
                    dp2.add(dp1.get(i));
                }
            }
            for(int i=0; i<dp1.size(); i++){
                if(i>0 && dp1.get(i)==dp1.get(i-1))
                {
                    dp2.add(dp1.get(i));
                }
            }
            for(Integer vals: dp2) {
                sb.append(vals + " ");
            }
            out.println(sb);
        }
        out.close();
    }
    static int[] IntArray(int size, BufferedReader br, StringTokenizer st) throws IOException
    {
        int [] dp = new int[size];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++)
        {
            dp[i] = Integer.parseInt(st.nextToken());
        }
        return dp;
    }

    static double[] DoubleArray(int size, BufferedReader br, StringTokenizer st) throws IOException
    {
        double [] dp = new double[size];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++)
        {
            dp[i] = Double.parseDouble(st.nextToken());
        }
        return dp;
    }

    static long[] LongArray(int size, BufferedReader br, StringTokenizer st) throws IOException
    {
        long [] dp = new long[size];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++)
        {
            dp[i] = Long.parseLong(st.nextToken());
        }
        return dp;
    }

    static String[] StringArray(int size, BufferedReader br, StringTokenizer st) throws IOException
    {
        String [] dp = new String[size];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++)
        {
            dp[i] = st.nextToken();
        }
        return dp;
    }

    static int[][] IntArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException
    {
        int [][] dp = new int[size1][size2];
        for(int i=0; i<size1; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<size2; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return dp;
    }

    static double[][] DoubleArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException
    {
        double [][] dp = new double[size1][size2];
        for(int i=0; i<size1; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<size2; j++) {
                dp[i][j] = Double.parseDouble(st.nextToken());
            }
        }
        return dp;
    }

    static long[][] LongArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException
    {
        long [][] dp = new long[size1][size2];
        for(int i=0; i<size1; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<size2; j++) {
                dp[i][j] = Long.parseLong(st.nextToken());
            }
        }
        return dp;
    }

    static String[][] StringArray2d(int size1, int size2, BufferedReader br, StringTokenizer st) throws IOException
    {
        String [][] dp = new String[size1][size2];
        for(int i=0; i<size1; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<size2; j++) {
                dp[i][j] = st.nextToken();
            }
        }
        return dp;
    }
}
