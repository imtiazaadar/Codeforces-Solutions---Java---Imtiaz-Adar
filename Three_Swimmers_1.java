package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.util.InputMismatchException;
/*
 *   @author : Imtiaz Adar
 */
public class Three_Swimmers_1 {
    public static void main(String[] args) throws IOException {
        InputReader scan = new InputReader();
        OutputStream outputstream = System.out;
        PrintWriter out = new PrintWriter(outputstream);
        Driver driver = new Driver();
        int n = scan.nextInt();
        while(n-->0)
            driver.Drive(scan, out);
        out.close();
    }

    static class Driver {
        void Drive(InputReader scan, PrintWriter out) throws IOException, InputMismatchException
        {
            StringBuilder sb = new StringBuilder();
            long p = scan.nextLong();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            if(p%a==0 || p%b==0 || p%c==0)
            {
                sb.append("0");
            }
            else {
                long res1 = Math.min(a-(p%a), b-(p%b));
                long finalresult = Math.min(res1, c-(p%c));
                sb.append(finalresult);
            }
            out.println(sb);
        }
    }

    static class InputReader {
        InputStream inputstream = System.in;
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        BufferedReader readfile = new BufferedReader(inputstreamreader);
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

        int[][] nextIntArray2D(int size1, int size2) throws IOException {
            int[][] arr = new int[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    arr[i][j] = Integer.parseInt(token.nextToken());
                }
            }
            return arr;
        }

        double[][] nextDoubleArray2D(int size1, int size2) throws IOException {
            double[][] arr = new double[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    arr[i][j] = Double.parseDouble(token.nextToken());
                }
            }
            return arr;
        }

        long[][] nextLongArray2D(int size1, int size2) throws IOException {
            long[][] arr = new long[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    arr[i][j] = Long.parseLong(token.nextToken());
                }
            }
            return arr;
        }

        String[][] nextStringArray2D(int size1, int size2) throws IOException {
            String[][] arr = new String[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    arr[i][j] = token.nextToken();
                }
            }
            return arr;
        }
    }
}
