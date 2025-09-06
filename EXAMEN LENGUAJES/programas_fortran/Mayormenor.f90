program Mayormenor
implicit none

integer :: n1, n2, n3
integer :: mayor, menor

print *, 'Ingrese tres números:'
read *, n1, n2, n3

mayor = n1
menor = n1

if (n2 > mayor) then
    mayor = n2
end if
if (n3 > mayor) then
    mayor = n3
end if

if (n2 < menor) then
    menor = n2
end if
if (n3 < menor) then
    menor = n3
end if

print *, 'El mayor es: ', mayor
print *, 'El menor es: ', menor

end program Mayormenor