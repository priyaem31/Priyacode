import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
         for(int i=1;i<=N;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println("");
         }
	}
}
