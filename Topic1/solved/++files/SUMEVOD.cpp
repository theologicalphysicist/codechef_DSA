using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

int main() {
	string input = "";

	std::cin >> input;

	unsigned long n = stoi(input);

	printf("%lu %lu", n * n, n * (n + 1));

	return 0;
}
