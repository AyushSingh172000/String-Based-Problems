package String;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args)
	//Take user input from user and print all the characters one by one from starting?
	{
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int i=0;
		System.out.println("Each Characters are:");
		while(i<s1.length())
		{
			System.out.println(s1.charAt(i));
			i++;
		}
		
		

	}

}
