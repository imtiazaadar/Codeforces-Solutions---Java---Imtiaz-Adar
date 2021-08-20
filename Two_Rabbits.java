package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   @author : Imtiaz Adar
 *   Stream : I'm Not Worth It
 */
public class Two_Rabbits implements Runnable{

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

        long[] LongArray(int size) throws IOException {
            long[] dp = new long[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < size; i++) {
                dp[i] = Long.parseLong(token.nextToken());
            }
            return dp;
        }
    }

    public static void main(String[] args) {
        new Thread(null, new Two_Rabbits(), "Imtiaz Adar", 1 << 27).start();
    }

    public void run(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer("");
        InputReader scan = new InputReader(input, tokenizer);
        int cases = scan.nextInt();
        while(cases-->0)
        {
            StringBuilder sb = new StringBuilder();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long d = scan.nextLong();
            long solution = (b - a) % (c + d);
            sb.append((solution == 0) ? (b - a) / (c + d) : -1);
            out.println(sb);
            out.flush();
        }
        out.close();
    }
}
