import java.util.*;
import java.lang.*;
import java.io.*;

class LAPIN {
	public static void main() {
		try{
			File file = new File("LAPIN_INPUT");
			Scanner input = new Scanner(file);
			
			int tests = Integer.parseInt(input.nextLine());

			for (int i = 0; i < tests; i++) {

				String S = input.nextLine(); int SL = S.length();
				String S1 = ""; String S2 = "";
				HashMap<Character, Integer> S1Dict = new HashMap<Character, Integer>();
				HashMap<Character, Integer> S2Dict = new HashMap<Character, Integer>();


				if (SL % 2 == 0) {
					S1 = Split(0, SL / 2, S);
					S2 = Split(SL / 2, SL, S);
				} else {
					S1 = Split(0, SL / 2, S);
					S2 = Split((SL / 2) + 1, SL, S);
				}

				S1Dict = SetDictionary(S1Dict);
				S2Dict = SetDictionary(S2Dict);
				SetStringDictionary(S1Dict, S1);
				SetStringDictionary(S2Dict, S2);
				// System.out.println(S1Dict);
				// System.out.println(S2Dict);
				// System.out.println(S1Dict.equals(S2Dict));
				
				if (SetStringDictionary(S1Dict, S1).equals(SetStringDictionary(S2Dict, S2))) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}

			}

			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}

	public static String Split(int S, int E, String str) {
		String temp = "";
		for (int i = S; i < E; i++) {
			temp += str.charAt(i);
		}
		return temp;
	}

	public static HashMap<Character, Integer> SetDictionary(HashMap<Character, Integer> D) {
		
		for (int i = 97; i < 123; i++) {
			D.put((char)i, 0);
		}

		return D;
	}

	public static HashMap<Character, Integer> SetStringDictionary(HashMap<Character, Integer> D, String str) {

		for (int i = 0; i < str.length(); i++) {
			D.put(str.charAt(i), D.get(str.charAt(i)) + 1);
		}
		return D;
	}
}