package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

/*
* @author : Imtiaz Adar
*/

public class Find_The_Array {
    public static void main(String[] args) throws IOException {
        InputReader scan = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Runner run = new Runner();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
            run.Raw(scan, out);
            out.close();
    }
    static class Runner {
        int demo(int num)
        {
            return (int)Math.pow(num,2);
        }
        void Raw(InputReader scan, PrintWriter out)
        {
            StringBuilder sb = new StringBuilder();
            int num = scan.nextInt();
            int result = 1, val = 1;
            while(demo(result) < num)
            {
                val++;
                result++;
            }
            sb.append(val);
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
