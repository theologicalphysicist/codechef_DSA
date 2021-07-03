using namespace std;

#include <iostream>
#include <string>

int main() {
	string N = "";
	std::cin >> N;
	if (stoi(N) % 55 == 0) {
		printf("%s", "BOTH");
	} else if ((stoi(N) % 5 == 0) || (stoi(N) % 11 == 0)) {
		printf("%s", "ONE");
	} else {
		printf("%s", "NONE");
	}
    return 0;
}
