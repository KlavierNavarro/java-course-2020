import java.util.Scanner;

public class Exercise0010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el dia de nacimiento: ");
		int dia = sc.nextInt();
		System.out.println();
		System.out.print("Dime el mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.println();
		System.out.print("Dime el año de nacimiento: ");
		int year = sc.nextInt();
		System.out.printf("%02d/%02d/%04d", dia, mes, year);
	}
}
