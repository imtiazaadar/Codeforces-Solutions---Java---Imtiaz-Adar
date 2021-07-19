package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  @author : Imtiaz Adar
 *  Exciting Bets - Imtiaz Adar
 */

public class Exciting_Bets {

	public static void main(String[] args) throws IOException {
		Take_Input scan = new Take_Input();
		int n = scan.nextInt();
		for(int i=0; i<n; i++)
		{
			Solve(scan);
		}
	}
	
	static void Solve(Take_Input scan)
	{
		long a = scan.nextLong();
		long b = scan.nextLong();
		StringBuilder sb = new StringBuilder();
		if(a == b)
		{
			sb.append("0 "+"0");
		}
		else {
			long diff = Math.abs(a-b);
			long mini = Math.min(a%diff,diff-(a%diff));
			sb.append(diff+" "+mini);
		}
		System.out.println(sb);
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
	}
}
