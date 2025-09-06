program Palabras
implicit none

character(len=100) :: palabra
integer :: longitud

print *, 'Ingrese una palabra:'
read *, palabra

longitud = len_trim(palabra)

print *, 'La palabra tiene ', longitud, ' letras'

end program Palabras