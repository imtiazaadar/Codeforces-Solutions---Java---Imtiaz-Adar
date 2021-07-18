package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @author : Imtiaz Adar
 * Police Recruits - Codeforces
 */

public class Police_Recruits {
	public static void main(String[] args) throws IOException {
		Take_Input scan = new Take_Input();
		int n = scan.nextInt();
		int[] arr = scan.nextIntArray(n);
		int police = 0, crime = 0;
		for(int item: arr)
		{
			if(item == -1)
			{
				if(police > 0)
				{
					police--;
				}
				else if(police == 0){
					crime++;
				}
			}
			else {
				police += item;
			}
		}
		System.out.println(crime);
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
