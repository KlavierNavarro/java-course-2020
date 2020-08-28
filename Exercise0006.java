import java.util.Scanner;

public class Exercise0006{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para convertir de euros a pesetas:");
		int pesetas = sc.nextInt();
		double euros = pesetas * 0.006;
		System.out.println(pesetas + " pesetas son " + euros + " euros.");
		
	}
}
