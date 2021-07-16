import java.util.*;
import java.lang.*;
import java.io.*;

class CARVANS {
	public static void main() {
		try {
			File file = new File("CARVANS_INPUT");
			Scanner input = new Scanner(file);
			int tests = Integer.parseInt(input.nextLine());
			for (int i = 0; i < tests; i++) {
				int N = Integer.parseInt(input.nextLine());
				if (N != 1) {
					String str[] = input.nextLine().split(" ");
					int S[] = new int[N];
					for (int j = 0; j < N; j++) {
						S[j] = Integer.parseInt(str[j]);
					}
					System.out.println(maxSpeed(S, S[0], 1, N));
				} else {
					input.nextLine();
					System.out.println(N);
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.print("ERROR: ");
			e.printStackTrace();
		}
	}
	public static int maxSpeed(int[] S, int max, int C, int N) {
		for (int i = 1; i < N; i++) {
			if (S[i] <= max) {
				max = S[i];
				C++;
			}
		}
		return C;
	}
}