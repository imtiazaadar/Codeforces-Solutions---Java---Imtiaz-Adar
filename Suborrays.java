package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Suborrays {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        int T = scan.nextInt();
        while(T-- > 0)
        {
            StringBuilder sb = new StringBuilder();
            int X = scan.nextInt();
            ArrayList<Integer> dp = new ArrayList<>();
            int ind = 0;
            for(int i = 1; i <= X; i++) {
                dp.add(ind, i);
                ind++;
            }
            Collections.shuffle(dp);
            for(Integer items : dp)
                sb.append(items + " ");
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
    }
}
