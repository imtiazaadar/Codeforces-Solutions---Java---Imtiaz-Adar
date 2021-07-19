package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @author : Imtiaz Adar
 * Plus And Multiply - Codeforces
 */

public class Plus_And_Multiply {
	public static void main(String[] args) {
		Take_Input scan = new Take_Input();
		int x = scan.nextInt();
		for(int i=0; i<x; i++)
		{
			long n = scan.nextLong();
			long a = scan.nextLong();
			long b = scan.nextLong();
			long k = 1;
			StringBuilder sb = new StringBuilder();
			boolean what = false;
			if(a == 1)
			{
				sb.append(((n-1)%b == 0)?"Yes":"No");
			}
			else {
				while(k <= n)
				{
					if((n-k)%b == 0)
					{
						what = true;
						break;
					}
					k *= a;
				}
				sb.append((what)?"Yes":"No");
			}
			System.out.println(sb);
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
	}
}
