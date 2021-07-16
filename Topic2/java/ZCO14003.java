import java.util.*;
import java.lang.*;
import java.io.*;

class ZCO14003 {
	public static void main() {
		try{
			File file = new File("ZCO14003_INPUT");
			Scanner input = new Scanner(file);
			int Buyers[] = new int[Integer.parseInt(input.nextLine())];
			for (int i = 0; i < Buyers.length; i++) {
				Buyers[i] = Integer.parseInt(input.nextLine());
			}
			// System.out.println(Arrays.toString(Buyers));
			// Buyers = mergeSort(Buyers);
			System.out.println(mergeSort(revenues(mergeSort(Buyers)))[Buyers.length - 1]);
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: ");
			e.printStackTrace();
		}
	}

	public static int[] mergeSort(int[] L) {

        int size = L.length;
        // int merged[] = new int[size];
        int Split1[] = Arrays.copyOfRange(L, 0, size / 2);
        int Split2[] = Arrays.copyOfRange(L, size / 2, size);

        int size1 = Split1.length; int size2 = Split2.length;
		// System.out.println(Arrays.toString(Split1) + "\n" + Arrays.toString(Split2));
		// System.out.println();

        if (size1 > 1) {
            Split1 = mergeSort(Split1);
        } 
        if (size2 > 1) {
            Split2 = mergeSort(Split2);            
        }
		// System.out.println(Arrays.toString(Split1) + "\n" + Arrays.toString(Split2));
		// System.out.println();

        // merged = merge(Split1, Split2);

		// System.out.println(Arrays.toString(merged));
		// System.out.println();

        return merge(Split1, Split2);
    }
    
    public static int[] merge(int[] S1, int[] S2) {
        // System.out.println(S1 + ", " + S2);
        int size1 = S1.length; 
		int size2 = S2.length;
        
        int merged[] = new int[size1 + size2];

        boolean finished = false; int i1 = 0; int i2 = 0; int index = 0;

        while (!finished){

            int si1 = S1[i1]; int si2 = S2[i2];
  
            if (si1 > si2) {
                merged[index] = si2;
                i2++; 
            } else {
                merged[index] = si1;
                i1++;
            }
			index++;
            if (i1 == size1) {
                for (i2 = i2; i2 < size2; i2++){
                    merged[index] = S2[i2]; 
					index++;
                }
				finished = true;
            } else if (i2 == size2) {
                for (i1 = i1; i1 < size1; i1++){
                    merged[index] = S1[i1]; 
					index++;
                }
				finished = true;
            }        
		}
        return merged;
    }

	public static int[] revenues(int[] B) {
		int temp[] = new int[B.length];

		for (int i = 0; i < B.length; i++) {
			temp[i] = B[i] * (B.length - i);
		}

		return temp;
	}
}