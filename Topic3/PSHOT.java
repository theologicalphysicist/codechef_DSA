import java.util.*;
import java.lang.*;
import java.io.*;

class PSHOT {
	public static void main() {
		try {
			File file = new File("txt/PSHOT_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			int tests = Integer.parseInt(input.readLine());
			for (int i = 0; i < tests; i++) {
				int N = Integer.parseInt(input.readLine());
				String AandB[] = input.readLine().split("");
				// System.out.println(Arrays.toString(AandB));
				String A[] = new String[N]; String B[] = new String[N];
				for (int j = 0; j < (2 * N); j++) {
					// System.out.println(Arrays.toString(A) + "\n" + Arrays.toString(B));
					if (j % 2 == 0) {
						A[j / 2] = AandB[j];
					} else {
						B[j / 2] = AandB[j];
					}
				}
				// System.out.println();
				System.out.println(minShots(A, B, (int) Math.floor( (double) N / 2) , N) + "\n");
			}
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}

	private static int minShots(String A[], String B[], int min, int N) {
		System.out.print(min + " ");
		int ab[] = {0, 0};
		for (int i = 0; i < min; i++) {
			ab = takeShots(A[i], B[i], ab);
		}
		System.out.println(Arrays.toString(ab));
		while ((Math.abs(ab[0] - ab[1]) <= (N - min)) && min != N) {
			ab = takeShots(A[min], B[min], ab);
			min++;
			System.out.println(min + " " + Arrays.toString(ab));
		} 
		return 2 * min;
	}

	private static int[] takeShots(String A, String B, int ab[]) {
		if (A.equals("1")) {
			ab[0]++;
		}
		if (B.equals("1")) {
			ab[1]++;
		}
		return ab;
	}
}