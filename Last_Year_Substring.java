package javaproject;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Last_Year_Substring {
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
            int X = scan.nextInt();
            String s = scan.next();
            for(int i = 0; i <= 4; i++)
            {
                try {
                    String sum = s.substring(0, i) + s.substring((X - 4) + i, 4 - i);
                    if(sum.equals("2020"))
                    {
                        sb.append("YES");
                        return;
                    }
                }
                catch(StringIndexOutOfBoundsException s1){}
            }
            sb.append("NO");
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
