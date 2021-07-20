package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

/*
* @author : Imtiaz Adar
*/

public class Ordinary_Numbers {
    public static void main(String[] args) {
       InputReader scan = new InputReader();
       Runner runner = new Runner();
       PrintWriter out = new PrintWriter(System.out);
       int n = scan.nextInt();
       for(int i = 0; i < n; i++)
           runner.Raw(scan, out);
           out.close();
    }

    static class Runner {
        void Raw(InputReader scan, PrintWriter out)
        {
            StringBuilder sb = new StringBuilder();
            int num = scan.nextInt();
            int ordinary = 0;
            for(int index = 1; index <= num; index = index * 10 + 1) {
                for (int d = 1; d <= 9; d++) {
                    if (index * d <= num) {
                        ordinary++;
                    }
                }
            }
            sb.append(ordinary);
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
                ;
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

        double[] nextDoubleArray(int size) throws IOException {
            double[] arr = new double[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(token.nextToken());
            }
            return arr;
        }
    }

}
