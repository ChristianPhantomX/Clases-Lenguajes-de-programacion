#include <iostream>
using namespace std;

int ma() {
    int N, A;
    cout << "Ingrese numeros: ";
    cin >> N >> A;

    if (A < N)
        cout << "El numero mayor es " << N << endl;
    else
        cout << "El numero mayor es " << A << endl;

    return 0;
}
