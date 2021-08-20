package javaproject;
import java.io.IOException;
import java.util.Scanner;
public class Help {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0)
                break;
            else {
                StringBuilder sb = new StringBuilder();
                int total = 0, unique = 0;
                int[] first = new int[26];
                int[] second = new int[26];
                for(int i = 0; i < n; i++) {
                    String a = sc.next();
                    int b = sc.nextInt();
                    String c = sc.next();
                    int val = (int) a.charAt(0) - 65;
                    if(c.equals("correct"))
                    {
                        unique++;
                        first[val]++;
                        total += b;
                    }
                    if(c.equals("incorrect"))
                    {
                        second[val] += 20;
                    }
                }
                for(int i = 0; i < first.length; i++)
                {
                    if(first[i] == 1)
                    {
                        total += second[i];
                    }
                }
                sb.append(unique+" "+total);
                System.out.println(sb);
            }
        }
    }
}
