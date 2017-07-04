#include <iostream>

int main() {
    int n, l, c;
    std::scanf("%d", &n);
    while (n--) {
        std::cin >> l >> c;
        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < c; ++j) {
                if(i >= 1 && i < l - 1 && j >= 1 && j < c - 1){
                    std::cout<<".";
                }else std::cout<<"*";
            }
            std::cout << std::endl;
        }
        std::cout << std::endl;
    }
}
