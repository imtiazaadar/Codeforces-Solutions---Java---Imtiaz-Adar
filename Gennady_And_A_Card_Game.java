package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Gennady_And_A_Card_Game {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        char [] parent = scan.next().toCharArray();
        char [] one = scan.next().toCharArray();
        char [] two = scan.next().toCharArray();
        char [] three = scan.next().toCharArray();
        char [] four = scan.next().toCharArray();
        char [] five = scan.next().toCharArray();
        boolean in = false;
        for(int i = 0; i < parent.length; i++)
            if(parent[i] == one[i] || parent[i] == two[i] || parent[i] == three[i] || parent[i] == four[i] || parent[i] == five[i]){
                in = true;
                break;
            }
        sb.append(in ? "YES" : "NO");
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
    }
}

