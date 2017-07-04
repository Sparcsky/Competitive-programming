#include <iostream>
#include<string>

int main() {
	
	int t;
	std::string str;
	std::cin >> t;
	int i = 0;
	while (i < t) {
		std::cin >> str;
		for (int a = 0; a < str.length() / 2; a++) {
			if (a % 2 == 0) {
				std::cout << str.substr(a, 1);
			}
		}
		std::cout << std::endl;  
		i++;
	}

	return 0;
}
