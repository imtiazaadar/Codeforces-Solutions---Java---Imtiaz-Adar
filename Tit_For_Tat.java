package java2021;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;

/*
 *  @author : Imtiaz Adar
 */

public class Tit_For_Tat {
	public static void main(String[] args) throws IOException{
		InputReader scan = new InputReader();
		OutputStream output = System.out;
		PrintWriter out = new PrintWriter(output);
		Driver drive = new Driver();
		int n = scan.nextInt();
		for(int i=0; i<n; i++)
			drive.Raw(scan, out);
			out.close();
	}
	
	static class Driver {
	    void Raw(InputReader scan, PrintWriter out) throws IOException
	    {
	        StringBuilder sb = new StringBuilder();
	        int x = scan.nextInt(); 
	        int y = scan.nextInt();
	        int [] dp = scan.nextIntArray(x);
	        int index = 0;
	        while(index < x && y > 0) // 3 1 4
	        {
	        	if(dp[index] == 0)
	        	{
	        		index++;
	        		continue;
	        	}
	        	dp[index]--; // 3 is now 2
	        	dp[x-1]++; // 4 is now 5
	        	y--; // y = 0
	        }
	        for(int items: dp)
	        {
	        	sb.append(items+" ");
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
