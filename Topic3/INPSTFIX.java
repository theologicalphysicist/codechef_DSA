import java.util.*;
import java.lang.*;
import java.io.*;

class INPSTFIX {
	public static void main() {
		try {
			File file = new File("txt/INPSTFIX_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			int T = Integer.parseInt(input.readLine());
			for (int i = 0; i < T; i++) {
				Stack<String> Infix = new Stack<String>();
				int c = Integer.parseInt(input.readLine());
				String Expression[] = input.readLine().split("");
				String Postfix = "";
				for (int j = 0; j < c; j++) {
					
				}


			}
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}