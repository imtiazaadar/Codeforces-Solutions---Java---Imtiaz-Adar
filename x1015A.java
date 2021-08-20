import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class x1015A {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int [] dp = new int[y + 2];
        for(int i = 0; i < x; i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            dp[l]++;
            dp[r + 1]--;
        }
        for(int i = 1; i <= y; i++)
            dp[i] += dp[i - 1];
        ArrayList<Integer> diff = new ArrayList<>();
        for(int i = 1; i <= y; i++)
            if(dp[i] == 0)
                diff.add(i);
        sb.append(diff.size() + "\n");
        for(Integer item : diff)
            sb.append(item + " ");
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
