import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Mocha_And_Red_And_Blue {
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
            char[] chr = scan.next().toCharArray();
            int pos = -1;
            for(int i = 0; i < chr.length; i++)
                if(chr[i] != '?'){
                    pos = i;
                    break;
                }
            if(pos == -1){
                for(int i = 0; i < chr.length; i++)
                {
                    if(i % 2 == 0)
                        chr[i] = 'B';
                    else
                        chr[i] = 'R';
                }
            }
            else{
                for(int i = pos - 1; i >= 0; i--){
                    if(chr[i + 1] == 'R') chr[i] = 'B';
                    else chr[i] = 'R';
                }
                for(int i = pos + 1; i < chr.length; i++)
                {
                    if(chr[i] == '?'){
                        if(chr[i - 1] == 'R')
                            chr[i] = 'B';
                        else
                            chr[i] = 'R';
                    }
                }
            }
            for(char ch : chr)
                sb.append(ch);
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
