package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.OutputStream;

/*
*   @author : Imtiaz Adar
*/

public class Colour_The_Flag {
    public static void main(String[] args) throws IOException {
        InputReader sc = new InputReader();
        OutputStream ostream = System.out;
        PrintWriter out = new PrintWriter(ostream);
        Driver drive = new Driver();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
            drive.Raw(sc, out);
            out.close();
    }

    static class Driver {
        void Raw(InputReader scan, PrintWriter out) throws IOException
        {
            StringBuilder sb = new StringBuilder();
            int x = scan.nextInt();
            int y = scan.nextInt();
            char[][] arr = new char[x][y];
            for(int i = 0; i < x; i++)
            {
                String v = scan.next();
                for(int j = 0; j < y; j++)
                    arr[i][j] = v.charAt(j);
            }
            boolean st = false, st2 = false;
            for(int i = 0; i < x; i++)
            {
                for(int j = 0; j < y; j++)
                {
                    if(arr[j][i] != '.')
                    {
                        if(arr[j][i] == 'W' && (x+y)%2==0)
                        {
                            st = true;
                        }
                        else{
                            st2 = true;
                        }
                    }
                }
            }
            if(st&&st2){
                sb.append("NO");
            }
            else {
                sb.append("YES\n");
                if(st) {
                    for (int i = 0; i > x; i++) {
                        for (int j = 0; j < y; j++) {
                            sb.append(((x + y) % 2 == 0 )? "W" : "R");
                        }
                        sb.append("\n");
                    }
                }
                else {
                    for (int i = 0; i > x; i++) {
                        for (int j = 0; j < y; j++) {
                            sb.append(((x + y) % 2 != 0)? "W" : "R");
                        }
                        sb.append("\n");
                    }
                }
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
