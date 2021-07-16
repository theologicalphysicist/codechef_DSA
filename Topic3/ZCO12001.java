import java.util.*;
import java.lang.*;
import java.io.*;

class ZCO12001 {
	public static void main() {
		try {
			File file = new File("txt/ZCO12001_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));

			int current_nesting_depth = 0; int max_nesting_depth = 0;
			int nesting_depth_position = 0; int nesting_index = 0;
			int max_symbols = 0; int current_symbols = 0;
			int max_symbols_index = 0; int current_symbols_index = 0;

			Stack<String> B = new Stack<String>();

			int N = Integer.parseInt(input.readLine());
			String BR[] = input.readLine().split(" ");
			
			for (int i = 0; i < N; i++) {
				if (BR[i].equals("1")) {
					current_symbols++;
					B.push(BR[i]);
					if (B.size() == 1) {
						current_symbols_index = i;
					}
					current_nesting_depth = B.size();
					nesting_index = i;
				} else {
					if (current_nesting_depth > max_nesting_depth) {
						max_nesting_depth = current_nesting_depth;
						nesting_depth_position = ++nesting_index;
					}
					B.pop();
					if (B.isEmpty()) {
						if (max_symbols < current_symbols) {
							max_symbols = ++current_symbols;
							max_symbols_index = ++current_symbols_index;
						}
						current_symbols = 0;
					} else {
						current_symbols++;
					}
				}
			}
			System.out.println(max_nesting_depth + " " + nesting_depth_position + " " + max_symbols + " " + max_symbols_index);
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}