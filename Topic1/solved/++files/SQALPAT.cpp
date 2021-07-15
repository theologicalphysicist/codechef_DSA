using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

int main() {
	string input = "";

	std::cin >> input;
	int n = stoi(input);

	int max = n * 5;
	bool s = false;

	for (int i = 0; i < max; i+=5) {
		string out = "";
		for (int j = i + 1; j < i + 6; j++) {
			if (s) {
				out = to_string(j) + " " + out;
			} else {
				out += (j == i + 1 ? to_string(j) : (" " + to_string(j)));
			}
		}
		std::cout << out << '\n';
		if (i % 10 == 0) {
			s = true;
		} else {
			s = false;
		}
	}

	return 0;
}
