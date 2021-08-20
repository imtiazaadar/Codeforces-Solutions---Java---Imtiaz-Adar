package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

/*
* @author : Imtiaz Adar
*/

public class Project_Euler_1 {
    public static void main(String[] args) {
        InputReader scan = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Runner run = new Runner();
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
            run.Raw(scan, out);
            out.close();
    }

    static class Runner {
        void Raw(InputReader scan, PrintWriter out)
        {
            StringBuilder sb = new StringBuilder();
            int num = scan.nextInt();
            int sum = 0;
            for(int j=1; j<num; j++)
            {
                if(j%3==0 || j%5==0)
                {
                    sum += j;
                }
            }
            sb.append(sum);
            out.println(sb);
        }
    }

    static class InputReader {
        BufferedReader readfile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");

        String next() {
            while (!token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(readfile.readLine());
                } catch (IOException e) {
                }
            }
            return token.nextToken();
        }

        String nextLine() throws IOException {
            return readfile.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int size) throws IOException {
            int[] arr = new int[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(token.nextToken());
            }
            return arr;
        }
    }

}
