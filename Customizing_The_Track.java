package javaproject;
import java.io.*;
import java.util.StringTokenizer;
/*
* @author : Imtiaz Adar
*/
public class Customizing_The_Track {
    public static void main(String[] args) throws IOException{
        InputReader scan = new InputReader();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Runner run = new Runner();
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
            run.Raw(scan, out);
            out.close();
    }

    static class Runner {
        void Raw(InputReader scan, PrintWriter out) throws IOException
        {
            StringBuilder sb = new StringBuilder();
            int x = scan.nextInt();
            long [] dp = scan.nextLongArray(x);
            long sum = 0;
            for(long item: dp)
            {
                sum += item;
            }
            long q = sum % x;
            long result = q * (x-q);
            sb.append(result);
            out.println(sb);
        }
    }

    static class InputReader {
        InputStream inputStream = System.in;
        BufferedReader readfile = new BufferedReader(new InputStreamReader(inputStream));
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

        int[][] nextIntArray2(int size1, int size2) throws IOException {
            int[][] arr = new int[size1][size2];
            for (int i = 0; i < size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for (int j = 0; j < size2; j++) {
                    arr[i][j] = Integer.parseInt(token.nextToken());
                }
            }
            return arr;
        }

        String[][] nextStringArray2(int size1, int size2) throws IOException {
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
