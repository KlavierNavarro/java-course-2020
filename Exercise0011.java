import java.util.Scanner;

public class Exercise0011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime cuatro n£meros: ");
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		String num3 = sc.nextLine();
		String num4 = sc.nextLine();
		String string12 = (num1 + num2);
		String string34 = (num3 + num4);
		int num12 = Integer.parseInt(string12);
		int num34 = Integer.parseInt(string34);
		System.out.print(num12 + num34);
		
	}
}
