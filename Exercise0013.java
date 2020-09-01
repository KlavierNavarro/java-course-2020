import java.util.Scanner;

public class Exercise0013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tres numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 >= 4 && num2 >= 4 && num3 >= 4) {
			System.out.print("Todos son mayores o iguales que 4");
		}
		else if (num1 < 4 && num2 < 4 && num3 < 4) {
		System.out.print("Ninguno es mayor o igual que 4");
		}
		else {
		System.out.print("Alguno es mayor o igual que 4");
		}
	}
}
