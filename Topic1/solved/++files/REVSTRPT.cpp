using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

int main() {
	string input = "";
	std::cin >> input;

	int n = stoi(input);

	for (size_t i = 0; i < n; i++) {
		string out = "*";
		for (size_t j = 0; j < i; j++) {
			out += "*";
		}
		// printf("%s\n", out);
		std::cout << out << '\n';
	}

	return 0;
}
