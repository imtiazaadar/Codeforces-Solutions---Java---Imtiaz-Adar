package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *	 @author : Imtiaz Adar
 *	 Strange Function - Codeforces
 */

public class Strange_Function {
	static final long mod = 1000000007L;
	static long gcd(long a, long b)
	{
		if(b == 0)
		{
			return a;
		}
		return gcd(b, a%b);
	}
	static long lcm(long a, long b)
	{
		return (a*b)/gcd(a, b);
	}
	public static void main(String[] args) throws IOException, ArithmeticException {
		Take_Input scan = new Take_Input();
		int n = scan.nextInt();
		for(int i=0; i<n; i++)
		{
			long num = scan.nextLong();
			long ans = (2*num)%mod;
			long s = 1;
			for(int j=2; j<=num; j++)
			{
				if(s > num)
				{
					break;
				}
				else {
					s = lcm(s,j);
					ans += (long)num/s;
					ans %= mod;
				}
			}
			System.out.println(ans);
			ans = 0;
		}
	}
	
	static class Take_Input {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next()
		{
			while(!st.hasMoreTokens())
			{
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e)
				{};
			}
			return st.nextToken();
		}
		String nextLine() throws IOException
		{
			return br.readLine();
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
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = Integer.parseInt(st.nextToken());
			}
			return arr;
		}
	}

}
