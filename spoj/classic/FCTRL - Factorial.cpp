    #include <iostream>
    #include <vector>
    #include <cmath>

    int main() {
        int T;
        long int n;

        std::scanf("%d", &T);
        while (T--) {
            std::scanf("%lu", &n);
            int tz = 0;
            while (n >= 5) {
                if (n <= 0)break;
                n = (long) std::floor(n / 5);
                tz += n;

            }
            std::printf("%d", tz);
           std::printf("\n");
        }
    }
