import java.util.Scanner;

public class Exercise0012 {
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el radio del circulo: ");
		double radio = sc.nextFloat();
		double area = PI * radio * radio;
		System.out.printf("El area del circulo es %3.2f", area);
	}
}
