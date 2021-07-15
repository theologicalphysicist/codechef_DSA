#include <iostream>
using namespace std;

int main() {
	string input_l = "";
	string input_r = "";

	cin >> input_l;
	cin >> input_r;

    for (int i = stoi(input_l); i < (stoi(input_r) + 1); i++) {
		// printf("%s\n%d\n", d, i);
		if (i % 2 != 0) {
			printf("%d ", i);
		}
	}
	return 0;
}
