package String;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args)
	//Take user input from user and print all the characters one by one from starting?
	{
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		printCharcterFromStart(s1);
		System.out.println("=======================");
		printCharcterFromEnd(s1);
	}
	
	public static void printCharcterFromStart(String s1) {
		int i=0;
		while(i<s1.length()) {
			System.out.print(s1.charAt(i));
			i++;
		}
	}
	public static void printCharcterFromEnd(String s1) {
		int i=s1.length()-1;
		while(i>=0) {
			System.out.print(s1.charAt(i));
			i--;
		}
	}
		

}


