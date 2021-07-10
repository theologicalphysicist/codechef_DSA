using namespace std;

#include <iostream>
#include <string>

const char *d = "FINE";

int main() {
	// printf("%d\n", argc);
	// std::cout << argv[0] << '\n';

	string input_l = "";
	string input_r = "";

	cin >> input_l;
	cin >> input_r;

	for (int i = stoi(input_l); i < (stoi(input_r) + 1); i++) {
		if (i % 2 != 0) {
			printf("%d ", i);
		}
	}

	return 0;
}
