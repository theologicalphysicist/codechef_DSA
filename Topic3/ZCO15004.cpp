using namespace std;

#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <stdlib.h>

const char *D = "FINE";
const int MAX_X = 100000;
const int MAX_Y = 500;

vector<string> split(string s, char delimiter) {
	vector<string> out;
	string sub = "";

	for (int i = 0; i < s.size(); i++) {
        if (s[i] == delimiter) {
            out.push_back(sub);
            sub = "";
        } else {
            sub += s[i];
        }
    }

    out.push_back(sub);

    return out;
}

// void Rectangle(int argc, char const *argv[]) {

// }

int main(int argc, char const *argv[]) {
	string line;
	std::ifstream DATAFILE("txt/ZCO15004_INPUT");

	getline(DATAFILE, line);
	const int N = stoi(line);

    //_ GET INPUTS
    vector<vector<string>> POINTS;
	for (int i = 0; i < N; i++) {
		getline(DATAFILE, line);
        POINTS.push_back(split(line, ' '));
	}

    vector<vector<int>> rects = {{0, 0, 100000, 500}};

    for (vector<string> POINT : POINTS) {
        const int X = stoi(POINT[0]);
        const int Y = stoi(POINT[1]);

        for (int i = 0; i < rects.size(); i++) {
            const int END_X = rects[i][2];
            const int START_X = rects[i][0];

            if (X > START_X and X < END_X) {
                const int END_Y = rects[i][3];
                const auto ITERATOR = rects.begin() + i;

                rects.erase(ITERATOR);

                rects.push_back({START_X, 0, X, END_Y});
                rects.push_back({X, 0, END_X, END_Y});

            }

        }

    }

    DATAFILE.close();

    int answer = 0;
    for (const vector<int> RECT : rects) {
        const int AREA = (RECT[2] - RECT[0]) * (RECT[3] - RECT[1]);
        answer = (AREA > answer) ? AREA : answer;
    }

/*    cout
        << "MAX X: " << max_x << "\n"
        << "MAX Y: " << max_y << "\n"
        << "MIN X: " << min_x << "\n"
        << "MIN Y: " << min_y << endl;
*/

    cout << "ANSWER: " << answer << endl;
    cout << "TOTAL RECTANGLES: " << rects.size() << endl;

    return 0;
}

//TODO: Create .sh for executing with clang
