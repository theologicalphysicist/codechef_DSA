import java.util.*;
import java.lang.*;
import java.io.*;

class FLOW007 {
	public static void main() {
		try {
			File file = new File("FLOW007_INPUT");
			Scanner input = new Scanner(file);
			
			int tests = Integer.parseInt(input.nextLine());
			
			for (int i = 0; i < tests; i++) {
				
				int num = Integer.parseInt(input.nextLine());
				String N = Integer.toString(num);
				
				int LofN = N.length();
				String N_R = "";
				Boolean Zero = (N.charAt(N.length() - 1) == '0') ? true : false;

				for (int j = (LofN - 1); j > -1; j--) {
					char CofN = N.charAt(j);
					if (Zero & (CofN != '0')) {
						Zero = false;
						N_R += CofN;	
					} else if (Zero & (CofN == '0')) {
					} else {
						N_R += CofN;	
					}
				}
				System.out.println(N_R);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
	}
}