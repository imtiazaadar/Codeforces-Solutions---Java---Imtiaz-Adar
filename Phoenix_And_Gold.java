package java2021;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 *  @author : Imtiaz Adar
 */

public class Phoenix_And_Gold {
	public static void main(String[] args) throws IOException {
		InputReader scan = new InputReader();
		OutputStream os = System.out;
		PrintWriter out = new PrintWriter(os);
		Driver drive = new Driver();
		int n = scan.nextInt();
		for(int i = 0; i < n; i++)
			drive.Raw(scan, out);
			out.close();
	}
	
	static class Driver {
	    void Raw(InputReader scan, PrintWriter out) throws IOException
	    {
	        StringBuilder sb = new StringBuilder();
	        long x = scan.nextLong();
	        long y = scan.nextLong();
	        long [] ar = scan.nextLongArray((int)x);
	        ArrayList<Long> dp = new ArrayList<Long>();
	        for(Long g: ar)
	        	dp.add(g);
	        long sum = 0;
	        for(long nums: ar)
	        	sum += nums;
	        if(dp.get(0) == y && dp.get(0) == dp.get(dp.size()-1) || sum == y)
	        {
	        	sb.append("NO");
	        }
	        else {
	        	sb.append("YES\n");
	        	long curr = 0;
	        	for(int j = 0; j < dp.size()-1; j++)
	        	{
	        		curr += dp.get(j);
	        		if(curr == y)
	        		{
	        			Collections.swap(dp, j, j+1);
	        			break;
	        		}
	        	}
	        	for(long items: dp) {
	        		sb.append(items+" ");
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
	}
}
