using namespace std;

#include <iostream>
#include <string>
#include <vector>
#include <fstream>

const char *D = "FINE";
const int MAX_X = 100000;
const int MAX_Y = 500;

string split(string s, string delimiter)[] {
	vector<string> out_v;
	string sub = "";

	for (int i = 0; i < s.size(); i++) {
		if (s[i] == delimiter) {
			out.push_back(sub);
			sub = "";
		} else {
			sub += s[i];
		}
	}

	const int LENGTH = out_v.size();
	string out[LENGTH];

	for (int i = 0; i < LENGTH; i++) {
		out[i] = out_v[i];
	}

	return out;
}

void Rectangle(int argc, char const *argv[]) {

}

int main(int argc, char const *argv[]) {

	string line;
	std::ifstream DATAFILE("txt/ZCO15004_INPUT");

	getline(DATAFILE, line);
	const int N = stoi(line);

	for (int i = 0; i < N; i++) {
		getline(DATAFILE, line);
		const string POINT[2] = split(line, " ");
	}


	// Rectangle();

	// std::cout << argv[0] << '\n';
	// string in = "";
	// std::cin >> in;
	// string line;
	//
	// getline(datafile, line);
	//
	// int n = stoi(line);
	// std::cout << line << '\n';
	// std::vector<pair<int, int>> xy;
	//
	// for (int i = 0; i < n; i++) {
	// 	// string x = "";
	// 	// std::cin >> x;
	// 	// string y = "";
	// 	// std::cin >> y;
	// 	getline(datafile, line);
	// 	// std::cout << to_string(line.size()) << "\n";
	// 	// pair<int, string>
	//
	// 	xy.push_back(
	// 		make_pair(
	// 			stoi(line.substr(0, line.find(" "))),
	// 			stoi(line.substr(line.find(" "), line.size() - 1))
	// 		)
	// 	);
	// }
	//
	// datafile.close();
	//
	// int max_rect = xy[1].first * max_Y;
	//
	// for (int i = 1; i < n - 1; i++) {
	// 	int rect = (xy[i].first - xy[i- 1].first) * max_Y;
	// 	max_rect = (rect > max_rect ? rect : max_rect);
	// }
	//
	// max_rect = (max_X - xy[n - 1].first)
	//
	// return 0;
}

//
// void printPairVector(vector<pair<int, int>> v) {
// 	for (pair<int, int> co_ord: v) {
// 		std::cout << " [" + to_string(co_ord.first) + ", " + to_string(co_ord.second) + "]"<< ',';
// 	}
// }
