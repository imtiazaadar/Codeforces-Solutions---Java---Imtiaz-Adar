package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class OmkarAndThePassword {
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
            int x = Integer.parseInt(token.nextToken());
            int [] dp = scan.IntArray(x);
            Arrays.sort(dp);
            if(dp[0] == dp[dp.length - 1])
                sb.append(x);
            else
                sb.append(1);
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
    }
}
