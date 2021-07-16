import java.util.*;
import java.lang.*;
import java.io.*;

class FCTRL {
	public static void main() {
		try {
			File file = new File("txt/FCTRL_INPUT");
			Scanner input = new Scanner(file);
			int tests = Integer.parseInt(input.nextLine());

			for (int i = 0; i < tests; i++) {
				
			}

			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}

	public static int Z(int F) {
		int temp = 0;
		
		return temp;
	}
}