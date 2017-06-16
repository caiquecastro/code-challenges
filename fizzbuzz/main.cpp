#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int from, to;
	int i = 0;

	if (argc != 3) {
		cerr << "Esse programa requer 2 argumentos de entrada" << endl;
		return 1;
	}

	from = atoi(argv[1]);
	to = atoi(argv[2]);

	if (from > 2000 || to > 2000) {
		cerr << "Os argumentos devem ser menores que 2000" << endl;
		return 1;
	}

	if (from > to) {
		cerr << "O primeiro argumento deve ser menor ou igual ao segundo argumento" << endl;
		return 1;
	}

	for (i = from; i <= to; i++) {
		if (i % 15 == 0) {
			cout << "FizzBuzz";
		} else if (i % 3 == 0) {
			cout << "Fizz";
		} else if (i % 5 == 0) {
			cout << "Buzz";
		} else {
			cout << i;
		}
		cout << endl;
	}

	return 0;
}
