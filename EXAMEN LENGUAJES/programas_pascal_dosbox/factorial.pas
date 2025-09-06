program Factorial;
uses crt;
var
   n, i: integer;
   factorial: qword;
begin
   clrscr;
   write('Ingresa un numero: ');
   readln(n);
   factorial := 1;
   for i := 1 to n do
      factorial := factorial * i;
   writeln('El factorial de ', n, ' es: ', factorial);
   readln;
end.
