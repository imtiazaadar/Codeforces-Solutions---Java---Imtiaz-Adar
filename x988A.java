import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 *   Author : Imtiaz Adar
 */
public class x988A {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int x = scan.nextInt();
        int y = scan.nextInt();
        TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for(int i = 0; i < x; i++)
        {
            int item = scan.nextInt();
            if(!m.containsValue(item)){
                m.put(i, item);
            }
            continue;
        }
        int count = 0;
        if(m.size() >= y)
        {
            sb.append("YES\n");
            for(Map.Entry<Integer, Integer> entry : m.entrySet()){
                count++;
                if(count <= y)
                    sb.append(entry.getKey() + 1 +  " ");
            }
        }
        else
            sb.append("NO");
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
