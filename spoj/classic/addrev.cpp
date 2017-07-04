#include<string>
#include<iostream>
int main() {
	int t;
	int l, c;

	scanf_s("%d", &t);
	while (t--) {
		std::cin >> l;
		std::cin >> c;


		for (int i = 0; i < l; i++)
		{
			for (int j = 0; j < c; j++)
			{

				if (i % 2 == 0 && j % 2 == 0) {
					std::cout << "*";
				}
				else if (i % 2 != 0 && j % 2 != 0) {
					std::cout << "*";
				}
				else 	std::cout << ".";

			}

			std::cout << std::endl;

		}
	}
	return 0;
}
