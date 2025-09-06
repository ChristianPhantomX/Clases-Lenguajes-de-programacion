program MayorMenor;
uses crt;
var
   N, A: integer;
begin
   clrscr;
   writeln('Ingrese numeros: ');
   readln(N);
   readln(A);
   if A < N then
      writeln('El numero mayor es ', N)
   else
      writeln('El numero mayor es ', A);
   readln;
end.
