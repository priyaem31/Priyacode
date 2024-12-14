import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Enter value : ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=1;x*i<=1000;i++){
            System.out.println(x*i);
        }
	}
}
