package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
/*
* @author : Imtiaz Adar
*/
public class Simple_Array_Sum {
    public static void main(String[] args) throws IOException{
        InputReader scan = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Runner run = new Runner();
        int n = scan.nextInt();
        int[] arr = scan.nextIntArray(n);
        int sum = 0;
        for(int items: arr){
            sum += items;
        }
        System.out.println(sum);
    }

    static class Runner {
        void Raw(InputReader scan, PrintWriter out)
        {
            StringBuilder sb = new StringBuilder();
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
