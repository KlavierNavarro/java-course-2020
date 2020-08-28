import java.util.Scanner;

public class Exercise0004{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad:");
		int edad = sc.nextInt();
		int edad2 = edad - 2;
		System.out.println("Pues parece que tengas " + edad2);
	}
}
