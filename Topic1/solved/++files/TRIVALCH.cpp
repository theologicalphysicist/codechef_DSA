using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

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

const char *d = "FINE";

int main() {

	string a_s, b_s, c_s;

	cin >> a_s; cin >> b_s; cin >> c_s;

	int a = stoi(a_s), b = stoi(b_s), c=stoi(c_s);

	int abc[3] = {a, b, c};

	bubblesort(abc, 3);

	printf("%s\n", ((abc[0] + abc[1] > abc[2]) ? "YES" : "NO"));

	return 0;
}
