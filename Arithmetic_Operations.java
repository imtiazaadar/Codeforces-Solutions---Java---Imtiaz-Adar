package javaproject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.PrintWriter;
/*
* @author : Imtiaz Adar
*/

public class Arithmetic_Operations {
    public static void main(String[] args) {
        Take_Input scan = new Take_Input();
        Process process = new Process();
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
        {
            process.Raw(scan);
        }
    }

    static class Process{
        void Raw(Take_Input scan)
        {
            int x = scan.nextInt();
            int total = 0;
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<x; i++)
            {
                int items = scan.nextInt();
                total += items;
            }
            sb.append((total < x)?"1":(total-x));
            System.out.println(sb);
        }
    }

    static class Take_Input {
        BufferedReader readfile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");
        String next()
        {
            while(!token.hasMoreTokens())
            {
                try {
                    token = new StringTokenizer(readfile.readLine());
                }
                catch(IOException e)
                {};
            }
            return token.nextToken();
        }

        String nextLine() throws IOException
        {
            return readfile.readLine();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int size) throws IOException
        {
            int [] arr = new int[size];
            token = new StringTokenizer(readfile.readLine());
            for(int i=0; i<arr.length; i++)
            {
                arr[i] = Integer.parseInt(token.nextToken());
            }
            return arr;
        }

        double[] nextDoubleArray(int size) throws IOException
        {
            double [] arr = new double[size];
            token = new StringTokenizer(readfile.readLine());
            for(int i=0; i<arr.length; i++)
            {
                arr[i] = Double.parseDouble(token.nextToken());
            }
            return arr;
        }

        String[] nextStringArray(int size) throws IOException
        {
            String [] arr = new String[size];
            token = new StringTokenizer(readfile.readLine());
            for(int i=0; i<arr.length; i++)
            {
                arr[i] = token.nextToken();
            }
            return arr;
        }

        int[][] nextIntArray2(int size1, int size2) throws IOException
        {
            int [][] arr = new int[size1][size2];
            for(int i=0; i<size1; i++)
            {
                token = new StringTokenizer(readfile.readLine());
                for(int j=0; j<size2; j++)
                {
                    arr[i][j] = Integer.parseInt(token.nextToken());
                }
            }
            return arr;
        }

        String[][] nextStringArray2(int size1, int size2) throws IOException
        {
            String [][] arr = new String[size1][size2];
            for(int i=0; i<size1; i++) {
                token = new StringTokenizer(readfile.readLine());
                for(int j=0; j<size2; j++)
                {
                    arr[i][j] = token.nextToken();
                }
            }
            return arr;
        }
    }
}
