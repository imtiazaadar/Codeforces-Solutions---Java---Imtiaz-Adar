package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 *  @author : Imtiaz Adar
 *  Fair Playoff - Codeforces
 */

public class Fair_Playoff {
	public static void main(String[] args) {
		Take_Input scan = new Take_Input();
		int n = scan.nextInt();
		for(int i=0; i<n; i++)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			StringBuilder sb = new StringBuilder();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			al.add(a); al.add(b); al.add(c); al.add(d);
			int firstmax = Math.max(a, b);
			int secondmax = Math.max(c, d);
			Collections.sort(al, Collections.reverseOrder());
			if((firstmax == al.get(0) && secondmax == al.get(1)) || (firstmax == al.get(1) && secondmax == al.get(0)))
			{
				sb.append("YES");
			}
			else {
				sb.append("NO");
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
