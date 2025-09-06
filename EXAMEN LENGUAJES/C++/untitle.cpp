#include <iostream>
#include <vector>
using namespace std;


void multiplicar(vector<int>& numero, int x) {
    int carry = 0;
    for (int i = 0; i < numero.size(); i++) {
        int producto = numero[i] * x + carry;
        numero[i] = producto % 10;
        carry = producto / 10;
    }
    while (carry) {
        numero.push_back(carry % 10);
        carry /= 10;
    }
}


void factorial(int n) {
    vector<int> resultado;
    resultado.push_back(1); 

    for (int i = 2; i <= n; i++) {
        multiplicar(resultado, i);
    }

    cout << "El factorial de " << n << " es:" << endl;
    for (int i = resultado.size() - 1; i >= 0; i--) {
        cout << resultado[i];
    }
    cout << endl;
}

int untitle() {
    int numero;
    cout << "Ingresa un numero: ";
    cin >> numero;

    factorial(numero);

    return 0;
}
