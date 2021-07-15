using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

int main() {

	string input = "";

	std::cin >> input;
	int a1 = stoi(input);

	std::cin >> input;
	int a2 = stoi(input);

	std::cin >> input;
	int a3 = stoi(input);

	printf("%s\n", ((a1 + a2 + a3 == 180) && (a1 > 0) && (a2 > 0) && (a3 > 0) ? "YES" : "NO"));

	return 0;
}
