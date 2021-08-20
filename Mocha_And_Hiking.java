// Let You Go Feat. Machine Gun Kelly
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Mocha_And_Hiking {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        int T = scan.nextInt();
        while(T-- > 0)
        {
            StringBuilder sb = new StringBuilder();
            int x = scan.nextInt();
            int[] dp = scan.IntArray(x);
            if(dp[0] == 1){
                sb.append(x + 1 + " ");
                for(int i = 0; i < x; i++)
                    sb.append(i + 1 + " ");
            }
            else{
                int temp = x;
                for(int i = x - 1; i >= 0; i--)
                    if(dp[i] == 1) temp = i;
                for(int i = 0; i < dp.length; i++)
                {
                    sb.append(i + 1 + " ");
                    if(i + 1 == temp) sb.append(x + 1 + " ");
                }
            }
            System.out.println(sb);
        }
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
