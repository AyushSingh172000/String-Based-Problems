package String;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args)
	//Take user input from user and print all the characters one by one from starting?
	{
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int i=s1.length()-1;
		System.out.println("Each Characters are:");
		while(i>=0)
		{
			System.out.println(s1.charAt(i));
			i--;
		}
		
		

	}

}
