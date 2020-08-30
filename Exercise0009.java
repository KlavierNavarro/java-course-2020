import java.util.Scanner;

public class Exercise0009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el lado del cuadrado: ");
		int lado = sc.nextInt();
		for(int i = 0;i < lado;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 2;i < lado;i++) {
			System.out.print("*");
			if(i >= 1 && i < lado) {
				for(int j = 1;j < lado-1;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
		for(int i = 0;i < lado;i++) {
			System.out.print("*");
		}
	}
}
