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

public class Odd_Divisor {
    static class Runner {
        void Raw(InputReader scan, PrintWriter out)
        {
            StringBuilder sb = new StringBuilder();
            long num = scan.nextLong();
            boolean odd = false;
            long num1 = num-1;
            if(num % 2 != 0)
            {
                sb.append("YES");
            }
            else{
                long nn = num;
                while(nn % 2 == 0)
                {
                    nn = nn / 2;
                }
                sb.append((nn > 1)?"YES":"NO");
            }
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

    public static void main(String[] args) {
        InputReader scan = new InputReader();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Runner run = new Runner();
        long n = scan.nextLong();
        for(long i = 1; i <= n; i++)
            run.Raw(scan, out);
        out.close();
    }
}
