import java.util.Scanner;

public class Exercise0007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura del cono:");
		double altura = sc.nextDouble();
		System.out.println("Introduce el radio de la base:");
		double radio = sc.nextDouble();
		double volumen = ((radio * radio) * altura * 3.1415926) / 3;
		System.out.println("El volumen del cono es " + volumen + " m cubicos");
	}
}
