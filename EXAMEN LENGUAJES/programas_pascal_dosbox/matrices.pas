program SumaMatrices;
uses crt;
var
   filas, columnas, i, j : integer;
   matriz1, matriz2, suma : array[1..10, 1..10] of integer;
begin
   clrscr;
   write('Ingresa el numero de filas: ');
   readln(filas);
   write('Ingresa el numero de columnas: ');
   readln(columnas);
   writeln;
   writeln('Ingresa los valores de la primera matriz:');
   for i := 1 to filas do
      for j := 1 to columnas do
      begin
         write('Matriz1[', i, '][', j, '] = ');
         readln(matriz1[i][j]);
      end;
   writeln;
   writeln('Ingresa los valores de la segunda matriz:');
   for i := 1 to filas do
      for j := 1 to columnas do
      begin
         write('Matriz2[', i, '][', j, '] = ');
         readln(matriz2[i][j]);
      end;
   for i := 1 to filas do
      for j := 1 to columnas do
         suma[i][j] := matriz1[i][j] + matriz2[i][j];
   writeln;
   writeln('La matriz resultante (suma) es:');
   for i := 1 to filas do
   begin
      for j := 1 to columnas do
         write(suma[i][j]:4);
      writeln;
   end;
   readln;
end.
