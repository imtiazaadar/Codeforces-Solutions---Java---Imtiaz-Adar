package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  @author : Imtiaz Adar
 *  GCD Sum - Codeforces
 */

public class GCD_Sum {
	public static void main(String[] args) {
		Take_Input scan = new Take_Input();
		Process process = new Process();
		int cases = scan.nextInt();
		for(int i=0; i<cases; i++)
		{
			process.Solve(scan);
		}
	}
	
	static class Process {
		long GCD(long a, long b)
		{
			return (b == 0)?a:GCD(b, a%b);
		}
		
		long Digit_Sum(long num)
		{
			long digsum = 0;
			long temp = num;
			while(temp > 0)
			{
				digsum += temp % 10;
				temp = temp / 10;
			}
			return GCD(num, digsum);
		}
		
		void Solve(Take_Input scan)
		{
			long val = scan.nextLong();
			StringBuilder sb = new StringBuilder();
			if(Digit_Sum(val) != 1)
			{
				sb.append(val);
			}
			else if(Digit_Sum(val+1) != 1)
			{
				sb.append(val+1);
			}
			else if(Digit_Sum(val+2) != 1)
			{
				sb.append(val+2);
			}
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
	}
}
