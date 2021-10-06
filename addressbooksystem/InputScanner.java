package addressbooksystem;

import java.util.Scanner;

public class InputScanner {
	public static Scanner scanner = new Scanner(System.in);

	// To take Double input
	public String inputString() {
		return scanner.next();
	}

	public void scannerClose() {
		scanner.close();
	}
}
