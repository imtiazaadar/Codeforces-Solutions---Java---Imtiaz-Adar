import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class Dislike_Of_Threes {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        int lim = scan.nextInt();
        for(int i = 0; i < lim; i++)
        {
            StringBuilder sb = new StringBuilder();
            int index = 1;
            int num = scan.nextInt();
            ArrayList<Integer> dp = new ArrayList<Integer>(0);
            while (dp.size() <= num){
                if(index % 3 != 0 && index % 10 != 3)
                    dp.add(index);
                index++;
            }
            sb.append(dp.get(num - 1));
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
