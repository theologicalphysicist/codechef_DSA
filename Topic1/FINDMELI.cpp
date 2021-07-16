using namespace std;

#include <iostream>
#include <string>

// #define D "FINE"

const char *d = "FINE";

int exists(string f, string a[], int len) {

	for (size_t i = 0; i < len; i++) {
		if (a[i] == f) {
			return 1;
		}
	}
	return -1;
}

void printcp(char *in, int len) {
	for (int i = 0; i < len; i++) {
		printf("%c ", in[i]);
	}
	printf("\n");
}

int main() {

	string nk[2] = {};

	cin >> nk[0];
	cin >> nk[1];

	// printf("%s\n", d);
	printf("%d\n", stoi(nk[0]));

	char *a = (char *) calloc(stoi(nk[0]) * 2, sizeof(char));
	string input = "";
	// cout << to_string(stoi(nk[0])) << '\n';
	// printf("%d\n", stoi(nk[1]));
	// printf("%s\n", d);

	cin >> input;

	cout << input << '\n';
	printcp(a, stoi(nk[0]));

	// cout << to_string(sizeof(a)/sizeof(a[0])) << '\n';

	printf("%c\n", a[0]);

	// printf("%d\n", exists(nk[1], a, stoi(nk[0])));

	return 0;
}
