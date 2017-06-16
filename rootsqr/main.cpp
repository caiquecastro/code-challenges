#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	double x, s, e, m, epsilon;

	x = (double) atoi(argv[1]);

	e = x;
	s = 1;
	m = x;

	epsilon = .00001; // change for more/less precision.

	while (true) {
		if (e - s < epsilon) break;

		m = (e + s) / 2;

		if (m*m > x) {
			e = m;
		} else {
			s = m;
		}
	}

	cout << m << endl;

	return 0;
}
