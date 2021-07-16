import java.util.*;
import java.lang.*;
import java.io.*;

class STUPMACH {
	public static void main() {
		try {
			File file = new File("txt/STUPMACH_INPUT");
			BufferedReader input = new BufferedReader(new FileReader(file));
			int tests = Integer.parseInt(input.readLine());
			for (int i = 0; i < tests; i++) {
				int N = Integer.parseInt(input.readLine());
				List<int[]> S = new ArrayList<int[]>();
				String Str[] = input.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					S.add(new int[]{Integer.parseInt(Str[j]), j + 1});
				}
				System.out.println(S.size());
			}
			input.close();
		} catch (IOException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}

    // public static List<int[]> mergeSort(List<int[]> S) {

    //     int size = S.size();
    //     List<int[]> merged = new ArrayList<int[]>();
    //     List<int[]> Split1 = S.subList(0, (int) size/2); 
    //     List<int[]> Split2 = S.subList((int) size/2, size);

    //     int size1 = Split1.size(); int size2 = Split2.size();

    //     // if (size1 == 1 && size2 == 1){
            
    //     // }
    //     if (size1 > 1) {
    //         Split1 = mergeSort(Split1);
    //     } 
    //     if (size2 > 1) {
    //         Split2 = mergeSort(Split2);            
    //     }
    //     merged = merge(Split1, Split2);

    //     // System.out.println(merged);

    //     return merged;
    // }
    
    // public static List<int[]> merge(List<int[]> S1, List<int[]> S2) {
    //     // System.out.println(S1 + ", " + S2);
    //     int size1 = S1.size(); int size2 = S2.size();
        
    //     List<int[]> merged = new ArrayList<int[]>();

    //     boolean finished = false; int i1 = 0; int i2 = 0;

    //     while (!finished){

    //         // int si1 = S1.get(i1); int si2 = S2.get(i2);
  
    //         if (si1 < si2) {
    //             // merged.add(si2);
    //             i2++;
    //         } else {
    //             // merged.add(si1);
    //             i1++;
    //         }
    //         if (i1 == size1) {
    //             for (i2 = i2; i2 < size2; i2++){
    //                 merged.add(S2.get(i2));
    //             }
	// 			finished = true;
    //         } else if (i2 == size2) {
    //             for (i1 = i1; i1 < size1; i1++){
    //                 merged.add(S1.get(i1));
    //             }
	// 			finished = true;
    //         }
    //     }
    //     return merged;
    // }
}