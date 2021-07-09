using namespace std;

#include <iostream>
#include <iterator>
#include <string>
#include <algorithm>

// const char *d = "FINE";



int main() {
	string input = "";
	printf("%s", "ENTER NUMBER: ");
	std::cin >> input;
	int N_in = stoi(input);

	int factorcount = 0;

	int *test = prime_factorizer(N_in, factorcount);
	printf("%d\n", factorcount);
	for (int i = 0; i < factorcount; i++) {
		printf("%d ", test[i]);
	}
	// printf("%s\n", "---------------------------------");
	// std::cout << test << '\n';

	return 0;
}
