import java.util.Scanner;

class Library 
{
	int acc_num;
	String title, author;
	Scanner in = new Scanner(System.in);
	
	void input() {
		System.out.println("Enter Accession Number:");
		acc_num = in.nextInt();
		in.nextLine();
		System.out.println("Enter Title:");
		title = in.nextLine();
		System.out.println("Enter Author Name:");
		author = in.nextLine();
	}

	void compute() {
		System.out.println("Enter Number of days late:");
		int late = in.nextInt();
		int fine = late * 2;
		System.out.println("The fine is: " + fine + " rupees");
	}

	void display() {
		System.out.println("acc_num\ttitle\tauthor");
		System.out.println(acc_num + "\n" + title + "\t" + author);
	}
}

public class q9a {
	
	public static void main(String args[]) {
		
		Library L = new Library();
		L.input();
		L.compute();
		L.display();
	}
}