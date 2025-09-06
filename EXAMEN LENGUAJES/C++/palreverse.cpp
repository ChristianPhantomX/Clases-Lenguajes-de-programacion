#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool esPalindromo(string texto) {
    string s;
    for (char c : texto) {
        if (isalnum(c))
            s += tolower(c);
    }
    int i = 0, j = s.size() - 1;
    while (i < j) {
        if (s[i] != s[j]) return false;
        i++; j--;
    }
    return true;
}

int main2() {
    string entrada;
    cout << "Ingresa una palabra o numero: ";
    getline(cin, entrada);

    if (esPalindromo(entrada))
        cout << " Se lee al reves." << endl;
    else
        cout << " No se lee al reves." << endl;

    return 0;
}
