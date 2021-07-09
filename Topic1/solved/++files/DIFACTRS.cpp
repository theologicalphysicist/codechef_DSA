using namespace std;

#include <iostream>
#include <iterator>
#include <string>
#include <algorithm>

// const char *d = "FINE";

int *prime_factorizer(int n, int &fc) {
	int *f = (int *) calloc(fc, sizeof(int));
	for (int i = 1; i <= (n / 2); i++) {
		if (n % i == 0) {
			fc++;
		    f = (int *) realloc(f, fc * sizeof(int));
			f[fc - 1] = i;
		}
	}
	f[fc] = n;
	fc++;
	return f;
}

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
