package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class x1189A {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int len = scan.nextInt();
        char [] chr = scan.next().toCharArray();
        int total = 0;
        for(int i = 0; i < len; i++)
            if(chr[i] == '0')
                total++;
            else if(chr[i] == '1')
                total--;
        if(total != 0)
            total = 1;
        else
            total = 2;
        //int newlen = len / total;
        sb.append(total + "\n");
        if(total == 1)
            for(int i = 0; i < len; i++)
                sb.append(chr[i]);
        else {
            for(int i = 0; i < len - 1; i++)
                sb.append(chr[i]);
            sb.append(" ");
            sb.append(chr[len - 1]);
        }
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
