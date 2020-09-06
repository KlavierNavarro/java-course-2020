import java.util.Scanner;

public class Exercise0014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuanta gente va a asistir a la conferencia?: ");
		int gente = sc.nextInt();
		while (gente >= 50) {
			int grupos = gente / 50;
			gente = gente - (grupos * 50);
			System.out.printf("%d grupos de 50 personas", grupos);
			System.out.println();
		}
		while (gente < 50 && gente >= 10) {
			int grupos2 = gente / 10;
			gente = gente - (grupos2 * 10);
			System.out.printf("%d grupos de 10 personas", grupos2);
			System.out.println();
		}
		while (gente < 10 &&  gente > 0) {
			int grupos3 = gente;
			gente = 0;
			System.out.printf("%d grupos de 1 persona", grupos3);
			System.out.println();
		}
	}
}
