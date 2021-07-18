package java2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  @author : Imtiaz Adar
 *  Brain's Photo - Codeforces
 */

public class Brains_Photo {

	public static void main(String[] args) throws IOException {
		Take_Input scan = new Take_Input();
		StringBuilder sb = new StringBuilder();
		int row = scan.nextInt();
		int col = scan.nextInt();
		boolean status = false;
		String[][] brain = scan.nextStringArray(row, col);
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(brain[i][j].equals("C") || brain[i][j].equals("M") || brain[i][j].equals("Y"))
				{
					status = true;
					break;
				}
			}
			if(status)
			{
				break;
			}
		}
		if(status)
		{
			sb.append("#Color");
		}
		else {
			sb.append("#Black&White");
		}
		System.out.println(sb);
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
	String[][] nextStringArray(int size1, int size2) throws IOException
	{
		String [][] arr = new String[size1][size2];
		for(int i=0; i<size1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<size2; j++)
			{
				arr[i][j] = st.nextToken();
			}
		}
		return arr;
	}
}
}
