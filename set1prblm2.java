import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 System.out.println("Enter values : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a+b+c == 180){
            System.out.println("Triangle can be formed");
        }else {
            System.out.println("Triangle can not be formed");
        }

	}
}
