import java.util.Scanner;

public class IT26102641Lab3Q3{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		int amount;
		System.out.print("Enter the Rupee Amount: ");
		amount = input.nextInt();
		
		int remaining = amount;
		
		int n5000 = remaining / 5000;
		remaining = remaining % 5000;
		
		int n1000 = remaining / 1000;
		remaining = remaining % 1000;
		
		int n500 = remaining / 500;
		remaining = remaining % 500;
		
		int n200 = remaining / 200;
		remaining = remaining % 200;
		
		int n100 = remaining / 100;
		remaining = remaining % 100;
		
		int n50 = remaining / 50;
		remaining = remaining % 50;
		
		int n20 = remaining / 20;
		remaining = remaining % 20;
		
		int n10 = remaining / 10;
		remaining = remaining % 10;
		
		int n5 = remaining / 5;
		remaining = remaining % 5;
		
		int n2 = remaining / 2;
		remaining = remaining % 2;
		
		int n1 = remaining;
		
		System.out.println("");
		System.out.println("5000 Notes - " + n5000);
		System.out.println("1000 Notes - " + n1000);
		System.out.println("500 Notes - " + n500);
		System.out.println("200 Notes - " + n200);
		System.out.println("100 Notes - " + n100);
		System.out.println("50 Notes - " + n50);
		System.out.println("20 Notes - " + n20);
		System.out.println("10 Notes - " + n10);
		System.out.println("5 Notes - " + n5);
		System.out.println("2 Notes - " + n2);
		System.out.println("1 Notes - " + n1);
	}
} 