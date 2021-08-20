package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Prime_Minister {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int X = scan.nextInt();
        int [] dp = scan.IntArray(X);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int tot = dp[0], tot1 = 0;
        for(int i = 1; i < dp.length; i++){
            if(dp[0] / 2 >= dp[i]){
                tot += dp[i];
                list.add(i + 1);
            }
            else
                tot1 += dp[i];
        }
        if(tot > tot1)
        {
            sb.append(list.size() + "\n");
            for(int i = 0; i < list.size(); i++)
                sb.append(list.get(i) + " ");
        }
        else
            sb.append(0);
        out.println(sb);
        out.flush();
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
    }
}
