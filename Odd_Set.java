package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Imtiaz Adar
 * Odd Set - Codeforces
 */
public class Odd_Set {
public static void main(String[] args) throws IOException{
	Fast_Scanner fastscan = new Fast_Scanner();
	int n = fastscan.nextInt();
	for(int i=0; i<n; i++)
	{
		int x = fastscan.nextInt();
		int c = 0;
		for(int j=0; j<x*2; j++)
		{
			int num = fastscan.nextInt();
			if(num % 2 == 1)
		    {
				c++;
			}
		}
		if(c == x)
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}

}
class Fast_Scanner{
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
			{}
		}
		return st.nextToken();
	}
	String nextLine() throws IOException
	{
		return br.readLine() ;
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
}
