using namespace std;

#include <iostream>
#include <string>

int adapted_bubblesort(int arr[]) {
	int *abc = (int *) calloc(3, sizeof(int));

	for (int i = 0; i < 3; i++) {
		abc[i] = arr[i];
	}
	for (int i = 0; i < 2; i++) {
		if (abc[i] > abc[i + 1]) {
			int temp = abc[i];
			abc[i] = abc[i + 1];
			abc[i + 1] = temp;
		}
	}
	// printf("%d %d %d\n", abc[0], abc[1], abc[2]);
	return (abc[1] > abc[0] ? abc[1] : abc[0]);
}

int main() {

	string a_s, b_s, c_s = "";

	std::cin >> a_s;
	std::cin >> b_s;
	std::cin >> c_s;

	printf("%d", adapted_bubblesort(new int[3]{stoi(a_s), stoi(b_s), stoi(c_s)}));

	return 0;
}
