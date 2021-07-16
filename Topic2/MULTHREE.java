import java.util.*;
import java.lang.*;
import java.io.*;

class MULTHREE {
	public static void main() {
		try {
			File file = new File("txt/MULTHREE_INPUT");
			Scanner input = new Scanner(file);

			int tests = Integer.parseInt(input.nextLine());

			for (int i = 0; i < tests; i++) {
				String str[] = input.nextLine().split(" ");
				long K = Long.parseLong(str[0]);
				System.out.println(K);
				// byte D[] = new byte[(int) K];
				// D[0] = Byte.parseByte(str[1]);
				// D[1] = Byte.parseByte(str[2]);
				// long sum = ((long) D[0]) + ((long) D[1]);
				// for (long j = 2; j < K; j++) {
				// 	D[(int) j] = (byte) (sum % 10);
				// 	sum += (long) D[(int) j];
				// }
				// if (sum % 3 == 0) {
				// 	System.out.println("YES");
				// } else {
				// 	System.out.println("NO");
				// }
			}

			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}