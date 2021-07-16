import java.util.*;
import java.lang.*;
import java.io.*;

class STFOOD {
	public static void main() {
		try {
			File file = new File("txt/STFOOD_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			int tests = Integer.parseInt(input.readLine());
			for (int i = 0; i < tests; i++) {
				int N = Integer.parseInt(input.readLine());
				int stores[][] = new int[N][3];
				for (int j = 0; j < N; j++) {
					String SPV[] = input.readLine().split(" ");
					stores[j][0] = Integer.parseInt(SPV[0]);
					stores[j][1] = Integer.parseInt(SPV[1]);
					stores[j][2] = Integer.parseInt(SPV[2]);
				}
				System.out.println(getMaxProfit(stores, 0, N));
			}
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}

	private static int getMaxProfit(int s[][], int p, int N) {
		for (int i = 0; i < N; i++) {
			int temp = profit(s[i]);
			if (temp > p) {
				p = temp;
			}
		}
		return p;
	}

	private static int profit(int s1[]) {
		return (s1[1] / (s1[0] + 1)) * s1[2];
	}
}