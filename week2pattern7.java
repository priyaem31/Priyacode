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
             for(int j=N-i+1;j>0;j--){
                 System.out.print(j+" ");
             }
             System.out.println("");
         }
	}
}
