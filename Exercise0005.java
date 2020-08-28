import java.util.Scanner;

public class Exercise0005{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para convertir de euros a pesetas:");
		int euros = sc.nextInt();
		int pesetas = euros * 166;
		System.out.println(euros + " euros son " + pesetas + " pesetas.");
		
	}
}
