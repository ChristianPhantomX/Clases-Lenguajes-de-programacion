program Celsius_A_F
implicit none

real :: celsius, fahrenheit

print *, 'Ingrese grados Celsius:'
read *, celsius

fahrenheit = (celsius * 9.0/5.0) + 32.0

print *, 'Equivalen a ', fahrenheit, ' Fahrenheit'

end program Celsius_A_F