import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Enter value : ");
        Scanner scan = new Scanner(System.in);
        String Firstname = scan.next();
        String Lastname = scan.next();
        int n = scan.nextInt();
        String x = Firstname+Lastname;
        for(int i=n;i!=0;i--){
            System.out.println(x);
        }
	}
}
