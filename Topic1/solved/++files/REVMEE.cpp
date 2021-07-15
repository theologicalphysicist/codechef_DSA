using namespace std;

#include <iostream>
// #include <string>

const char *d = "FINE";

int main() {

	string input = "";

	cin >> input;
	// cout << input << '\n';
	int n = stoi(input);

	string a[n] = {};
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}

	for (int i = n - 1; i > -1; i--) {
		cout << a[i]<< ' ';
	}

	return 0;
}
