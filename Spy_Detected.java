package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * Imtiaz Adar
 */

public class Spy_Detected {
public static void main(String[] args) throws IOException {
	Take_Input scan = new Take_Input();
	int n = scan.nextInt();
	for(int i=0; i<n; i++)
	{
		int x = scan.nextInt();
		Map<Integer, Integer> tm = new HashMap<Integer, Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int j=0; j<x; j++)
		{
			int num = scan.nextInt();
			alist.add(num);
			if(!tm.containsKey(num))
			{
				tm.put(num, 1);
			}
			else {
				tm.replace(num, tm.get(num)+1);
			}
		}
		int index = 0;
		for(Map.Entry<Integer, Integer> entr: tm.entrySet())
		{
			if(entr.getValue() == 1)
			{
				index = alist.indexOf(entr.getKey());
			}
		}
		System.out.println(index+1);
	}
}
static class Take_Input {
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
	int[] nextIntArray(int size, BufferedReader bfread, StringTokenizer token) throws IOException
	{
		int [] arr = new int[size];
		token = new StringTokenizer(bfread.readLine());
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(token.nextToken());
		}
		return arr;
	}
	double[] nextDoubleArray(int size, BufferedReader bfread, StringTokenizer token) throws IOException
	{
		double [] arr = new double[size];
		token = new StringTokenizer(bfread.readLine());
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Double.parseDouble(token.nextToken());
		}
		return arr;
	}
}
}
