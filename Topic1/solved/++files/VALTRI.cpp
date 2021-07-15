using namespace std;

#include <iostream>
#include <string>

int main() {
	string input = "";

	cin >> input;

	int bus = stoi(input);

	string out = ((bus % 5 == 0 || bus % 6 == 0) ? "YES" : "NO");

	cout << out << '\n';
	return 0;
}
