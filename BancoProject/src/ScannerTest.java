import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Coloque um numero");
		char c = scanner.next().charAt(0);
		System.out.println("valor =" + c);

	}

}
