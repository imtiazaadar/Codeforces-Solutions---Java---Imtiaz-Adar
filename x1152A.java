import static java.lang.Math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class x1152A {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int [] dp1 = scan.IntArray(X);
        int [] dp2 = scan.IntArray(Y);
        int dpoeven = 0, dpoodd = 0, dpteven = 0, dptodd = 0;
        for(Integer it : dp1){
            if(it % 2 == 0) dpoeven++;
            else dpoodd++;
        }
        for(Integer it2 : dp2){
            if(it2 % 2 == 0) dpteven++;
            else dptodd++;
        }
        int result = min(dpoeven, dptodd) + min(dpteven, dpoodd);
        sb.append(result);
        System.out.println(sb);
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
