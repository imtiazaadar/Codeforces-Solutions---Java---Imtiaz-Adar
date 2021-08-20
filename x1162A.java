import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import static java.lang.Math.*;
/*
 *   Author : Imtiaz Adar
 */
public class x1162A {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int [] dp = new int[C * 3];
        for(int i = 0; i < A; i++) Arrays.fill(dp, B);
        for(int i = 0; i < C; i++)
        {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();
            for(int j = X - 1; j < Y; j++)
            {
                dp[j] = min(dp[j], Z);
            }
        }
        int total = 0;
        for(int g = 0; g < A; g++)
            total += (dp[g] * dp[g]);
        sb.append(total);
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
    }
}
