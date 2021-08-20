import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Math.*;
/*
 *   Author : Imtiaz Adar
 */
public class x1173A {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a - b - c > 0)
            sb.append('+');
        else if(a - b + c < 0)
            sb.append('-');
        else if(a == b && c == 0)
            sb.append('0');
        else
            sb.append('?');
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
