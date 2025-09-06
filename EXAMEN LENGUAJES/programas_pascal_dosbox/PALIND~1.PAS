Program Palindromo;
Uses Crt;

Function EsPalindromo(cadena: string): boolean;
Var
   i, j: integer;
   igual: boolean;
Begin
   { Pasamos a minúsculas }
   For i := 1 to Length(cadena) do
      if (cadena[i] >= 'A') and (cadena[i] <= 'Z') then
         cadena[i] := Chr(Ord(cadena[i]) + 32);

   i := 1;
   j := Length(cadena);
   igual := true;

   While (i < j) and (igual) do
   Begin

      While (i < j) and not ((cadena[i] in ['a'..'z']) or (cadena[i] in ['0'..'9'])) do
         Inc(i);
      While (j > i) and not ((cadena[j] in ['a'..'z']) or (cadena[j] in ['0'..'9'])) do
         Dec(j);

      if cadena[i] <> cadena[j] then
         igual := false;

      Inc(i);
      Dec(j);
   End;

   EsPalindromo := igual;
End;

Var
   entrada: string;
Begin
   ClrScr;
   Write('Ingresa una palabra o numero: ');
   ReadLn(entrada);

   If EsPalindromo(entrada) then
      WriteLn(' Se lee alrevez.')
   else
      WriteLn(' No se lee alrevez.');

   ReadLn;
End.
