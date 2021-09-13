using namespace std;

#include <iostream>
#include <string>
#include <vector>
#include <fstream>

const char *d = "FINE";
const int max_X = 100000;
const int max_Y = 500;

int main(int argc, char const *argv[]) {
	// string in = "";
	// std::cin >> in;
	std::ifstream datafile("txt/ZCO15004_INPUT");
	string line;

	getline(datafile, line);

	int n = stoi(line);
	std::cout << line << '\n';
	std::vector<pair<int, int>> xy;

	for (int i = 0; i < n; i++) {
		// string x = "";
		// std::cin >> x;
		// string y = "";
		// std::cin >> y;
		getline(datafile, line);
		// std::cout << to_string(line.size()) << "\n";
		// pair<int, string>

		xy.push_back(
			make_pair(
				stoi(line.substr(0, line.find(" "))),
				stoi(line.substr(line.find(" "), line.size() - 1))
			)
		);
	}

	datafile.close();

	int max_rect = xy[1].first * max_Y;

	for (int i = 1; i < n - 1; i++) {
		int rect = (xy[i].first - xy[i- 1].first) * max_Y;
		max_rect = (rect > max_rect ? rect : max_rect);
	}

	max_rect = (max_X - xy[n - 1].first)

	return 0;
}

void printPairVector(vector<pair<int, int>> v) {
	for (pair<int, int> co_ord: v) {
		std::cout << " [" + to_string(co_ord.first) + ", " + to_string(co_ord.second) + "]"<< ',';
	}
}
