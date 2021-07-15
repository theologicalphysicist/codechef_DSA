using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

void bubblesort(int abc[], int len) {
	for (size_t i = 0; i < len; i++) {
		for (size_t j = 0; j < (len - (i + 1)); j++) {
			if (abc[j] > abc[j + 1]) {
				int temp = abc[j + 1];
				abc[j + 1] = abc[j];
				abc[j] = temp;
			}
		}
	}
}

int main() {
	string input = "";

	std::cin >> input;
	int l1 = stoi(input);

	std::cin >> input;
	int l2 = stoi(input);

	std::cin >> input;
	int l3 = stoi(input);

	int l[3] = {l1, l2, l3};

	bubblesort(l, 3);

	if (l[0] + l[1] <= l[2]) {
		printf("%d\n", -1);
	} else if ((l[0] == l[2])) {
		printf("%d\n", 1);
	} else if ((l[0] == l[1]) || (l[1] == l[2])) {
		printf("%d\n", 2);
	} else {
		printf("%d\n", 3);
	}

	return 0;
}
