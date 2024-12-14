import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Enter value : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        switch(size){
            case (29): 
                System.out.println("small");
                break;
            case(30) : 
                System.out.println("Medium");
                break;
            case(38) : 
                System.out.println("Large");
                break;
            case(42) : 
                System.out.println("XLarge");
                break;
            default : 
                System.out.println("Invalid");
                break;
        }
	}
}
