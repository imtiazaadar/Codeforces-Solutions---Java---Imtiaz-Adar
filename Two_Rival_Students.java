package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Two_Rival_Students {
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
            int w = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            int res = Math.min(w - 1, Math.abs(y - z) + x);
            sb.append(res);
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
    }
}
