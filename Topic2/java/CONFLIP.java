import java.util.*;
import java.lang.*;
import java.io.*;

class CONFLIP {
	public static void main() {
		try {
			File file = new File("txt/CONFLIP_INPUT");
			Scanner input = new Scanner(file);
			int tests = Integer.parseInt(input.nextLine());
			for (int i = 0; i < tests; i++) {
				int G = Integer.parseInt(input.nextLine());
				for (int j = 0; j < G; j++) {
					String INQ[] = input.nextLine().split(" ");
					System.out.println(ans((Integer.parseInt(INQ[0]) == 1) ? true : false, Integer.parseInt(INQ[1]), (Integer.parseInt(INQ[2]) == 1) ? true : false));
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}

	public static int ans(boolean I, int N, boolean Q) {
		if (N % 2 == 0) {
			return N / 2;
		} else {
			if (I == Q) {
				return (N - 1) / 2;
			}
		}
		return (N + 1) / 2;
	}
}