#include <iostream>
#include <iomanip>
#include <thread>
#include <chrono>

using namespace std;

int CRONO() {
    int horas = 0, minutos = 0, segundos = 0;

    while (true) {
        
        cout << setw(2) << setfill('0') << horas << ":"
             << setw(2) << setfill('0') << minutos << ":"
             << setw(2) << setfill('0') << segundos << "\r" << flush;

        this_thread::sleep_for(chrono::seconds(1));

        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
    }

    return 0;
}
