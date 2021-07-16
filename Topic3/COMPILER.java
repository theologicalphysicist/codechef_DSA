import java.util.*;
import java.lang.*;
import java.io.*;

class COMPILER {
	public static void main() {
		try {
			File file = new File("txt/COMPILER_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			int tests = Integer.parseInt(input.readLine());
			for (int i = 0; i < tests; i++) {
				String str[] = input.readLine().split("");
				// System.out.println(Arrays.toString(str));
				Stack<String> instr = new Stack<String>();
				Queue<Integer> indexes = new LinkedList<Integer>();
				int valid = 0; int latest = 0;
				for (int j = 0; j < str.length; j++) {
					if (str[j].equals("<")) {
						instr.push("<");
						// indexes.push(j);
						latest = j;
					} else {
						if (instr.size() == 0) {
							j = str.length;
						} else {
							valid+=2;
							instr.pop();
						}
					}
					if (instr.size() > 0) {
						valid = latest;
					}
				}
				System.out.println(valid);
			}
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}