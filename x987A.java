import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 *   Author : Imtiaz Adar
 */
public class x987A {
    static final int total_colours = 6;
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer token = new StringTokenizer("");
        InputReader scan = new InputReader(br, token);
        StringBuilder sb = new StringBuilder();
        int x = scan.nextInt();
        sb.append(total_colours - x + "\n");
        String colour;
        boolean red = false, blue = false, yellow = false, orange = false, green = false, purple = false;
        for(int i = 0; i < x; i++) {
            colour = scan.next();
            if(colour.equals("red"))
                red = true;
            else if(colour.equals("blue"))
                blue = true;
            else if(colour.equals("yellow"))
                yellow = true;
            else if(colour.equals("orange"))
                orange = true;
            else if(colour.equals("green"))
                green = true;
            else if(colour.equals("purple"))
                purple = true;
        }
        if(!red) sb.append("Reality\n");
        if(!blue) sb.append("Space\n");
        if(!yellow) sb.append("Mind\n");
        if(!orange) sb.append("Soul\n");
        if(!green) sb.append("Time\n");
        if(!purple) sb.append("Power\n");
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
