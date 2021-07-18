package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  Imtiaz Adar
 */

public class Sum_Of_2050 {
public static void main(String[] args) throws IOException{
	Take_Input scan = new Take_Input();
	int n = scan.nextInt();
	for(int i=0; i<n; i++)
	{
		long x = scan.nextLong();
		if(x % 2050 != 0)
		{
			System.out.println("-1");
		}
		else {
			long val = x / 2050;
			long temp = 0;
			while(val > 0)
			{
				temp += val % 10;
				val /= 10;
			}
			System.out.println(temp);
		}
	}
}
static class Take_Input{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer("");
	String next()
	{
		while(!st.hasMoreTokens())
		{
			try {
				st = new StringTokenizer(bf.readLine());
			}
			catch(IOException e)
			{};
		}
		return st.nextToken();
	}
	String nextLine() throws IOException
	{
		return bf.readLine();
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
}
