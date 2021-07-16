import java.util.*;
import java.lang.*;
import java.io.*;

class LADDU {
	public static void main() {
		try {
			File file = new File("txt/LADDU_INPUT");
			Scanner input = new Scanner(file);

			int tests = Integer.parseInt(input.nextLine());

			for (int i = 0; i < tests; i++) {
				int laddus = 0;

				String str[] = input.nextLine().split(" ");
				// System.out.println(Arrays.toString(str));
				int activities = Integer.parseInt(str[0]);
				final int MIN_LADDUS = (str[1].equals("INDIAN")) ? 200 : 400;
				// System.out.println(str[1]);
				// System.out.println(str[1].equals("INDIAN"));
				
				for (int j = 0; j < activities; j++) {
					str = input.nextLine().split(" ");
					switch (str[0]) {
						case "CONTEST_WON":
							laddus += 300 + (20 - Integer.parseInt(str[1]));
							break;
						case "TOP_CONTRIBUTOR":
							laddus += 300;
							break;
						case "BUG_FOUND":
							laddus += Integer.parseInt(str[1]);
							break;
						case "CONTEST_HOSTED":
							laddus += 50;
							break;
					}
				}
				System.out.println(laddus);
				System.out.println(laddus / MIN_LADDUS);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}