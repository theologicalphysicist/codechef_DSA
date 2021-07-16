import java.util.*;
import java.lang.*;
import java.io.*;

class CHFQUEUE {
	public static void main() {
		try {
			File file = new File("txt/CHFQUEUE_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}
}