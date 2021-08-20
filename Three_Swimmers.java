package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
/*
 *   @author : Imtiaz Adar
 */
public class Three_Swimmers {
    public static void main(String[] args) throws IOException {
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        InputStream inputstream = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            StringBuilder sb = new StringBuilder();
            if(p%a==0 || p%b==0 || p%c==0){
                sb.append("0");
            }
            else {
                long res = Math.min(a-(p%a), b-(p%b));
                long res2 = Math.min(res, c-(p%c));
                sb.append(res2);
            }
            out.println(sb);
        }
        out.close();
    }
}
