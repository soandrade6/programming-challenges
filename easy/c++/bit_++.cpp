#include <iostream>
#include <string>

int main() {
    // https://codeforces.com/problemset/problem/282/A

    int n;
    std::cin >> n;

    int cont = 0;
    for (int i = 0; i < n; ++i) {
        std::string statement;
        std::cin >> statement;

        if (statement.find("++") != std::string::npos) {
            cont += 1;
        } else {
            cont -= 1;
        }
    }

    std::cout << cont << std::endl;

    return 0;
}
