package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  @author : Imtiaz Adar
 *  Arithmetic Array - Codeforces
 */

public class Arithmetic_Array {
	public static void main(String[] args) throws IOException{
		Take_Input scan = new Take_Input();
		Process process = new Process();
		int n = scan.nextInt();
		for(int i=0; i<n; i++)
		{
			process.Raw(scan);
		}
	}
	
	static class Process{
		void Raw(Take_Input scan)
		{
			StringBuilder sb = new StringBuilder();
			int x = scan.nextInt();
			int total = 0;
			for(int i=0; i<x; i++)
			{
				int items = scan.nextInt();
				total += items;
			}
			sb.append((total < x)?"1":(total-x));
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
	}
}
