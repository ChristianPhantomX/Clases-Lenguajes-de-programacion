program Factorial
implicit none

integer :: n, i
integer :: fact

print *, 'Ingrese un número:'
read *, n

fact = 1
do i = 1, n
    fact = fact * i
end do

print *, 'El factorial es: ', fact

end program Factorial