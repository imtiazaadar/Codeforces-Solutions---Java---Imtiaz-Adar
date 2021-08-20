import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Infinity_Table {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        int T = scan.nextInt();
        while(T-- > 0)
        {
            StringBuilder sb = new StringBuilder();
            long num = scan.nextLong();
            long fin = (long) Math.ceil((double)(Math.sqrt(num)));
            long primary = (long) Math.sqrt(num);
            primary *= primary;
            if(num - primary == 0)
                sb.append(fin + " " + 1);
            else if(num - primary <= fin)
                sb.append((num - primary) + " " + fin);
            else{
                long newfin = fin * fin;
                sb.append(fin + " " + (newfin - num + 1));
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
    }
}
