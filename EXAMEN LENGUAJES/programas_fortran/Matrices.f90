program Matrices
implicit none

integer :: A(2,2), B(2,2), C(2,2)
integer :: i, j

print *, 'Ingrese matriz A (2x2):'
do i = 1, 2
    do j = 1, 2
        read *, A(i,j)
    end do
end do

print *, 'Ingrese matriz B (2x2):'
do i = 1, 2
    do j = 1, 2
        read *, B(i,j)
    end do
end do

C = A + B

print *, 'La suma de matrices es:'
do i = 1, 2
    print *, C(i,1), C(i,2)
end do

end program Matrices