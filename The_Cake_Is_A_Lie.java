package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.OutputStream;

/*
* @author : Imtiaz Adar
*/

public class The_Cake_Is_A_Lie {
    public static void main(String[] args) {
        InputReader scan = new InputReader();
        OutputStream ostream = System.out;
        PrintWriter out = new PrintWriter(ostream);
        Driver drive = new Driver();
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
            drive.Raw(scan, out);
            out.close();
    }

    static class Driver {
        void Raw(InputReader scan, PrintWriter out)
        {
            StringBuilder sb = new StringBuilder();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextInt();
            sb.append(((a*b)-1 == c)?"YES":"NO");
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

        double[] nextDoubleArray(int size) throws IOException {
            double[] arr = new double[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(token.nextToken());
            }
            return arr;
        }

        long[] nextLongArray(int size) throws IOException {
            long[] arr = new long[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(token.nextToken());
            }
            return arr;
        }

        String[] nextStringArray(int size) throws IOException {
            String[] arr = new String[size];
            token = new StringTokenizer(readfile.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = token.nextToken();
            }
            return arr;
        }
    }
}
