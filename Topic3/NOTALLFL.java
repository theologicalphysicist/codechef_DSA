import java.util.*;
import java.lang.*;
import java.io.*;

class NOTALLFL {
	public static void main() {
		try {
			File file = new File("txt/NOTALLFL_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}