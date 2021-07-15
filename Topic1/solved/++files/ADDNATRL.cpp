using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

int main() {
	string input = "";
	std::cin >> input;

	unsigned long n = stoi(input);

	printf("%lu\n", ((n * (n + 1)) / 2));

	return 0;
}
