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
public class Substring_Removal_Game {
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
            String full = token.nextToken();
            full += '0';
            char[] chr = full.toCharArray();
            ArrayList<Integer> dp1 = new ArrayList<Integer>();
            int count = 0;
            for(int i = 0; i < chr.length; i++)
            {
                if(chr[i] == '1')
                    count++;
                else {
                    dp1.add(count);
                    count = 0;
                }
            }
            Collections.sort(dp1, Collections.reverseOrder());
            int total_to_remove = 0;
            for(int j = 0; j < dp1.size(); j++)
            {
                if(j % 2 == 0)
                    total_to_remove += dp1.get(j);
            }
            sb.append(total_to_remove);
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
