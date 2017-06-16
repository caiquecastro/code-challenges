#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int number, remaining, divisor = 2, count = 0;
	if (argc < 2) {
		cout << "Invalid input" << endl;
		return 1;
	}

	number = remaining = atoi(argv[1]);

	while (remaining > 1) {
		while (remaining % divisor == 0) {
			remaining /= divisor;
			count++;
		}
		divisor++;
	}

	cout << count << endl;

	return 0;
}
