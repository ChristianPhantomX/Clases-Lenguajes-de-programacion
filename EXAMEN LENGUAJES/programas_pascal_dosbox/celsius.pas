program CelsiusAFahrenheit;
uses crt;
var
   celsius, fahrenheit: real;
begin
   clrscr;
   writeln('Ingrese la temperatura en Celsius para convertir a Fahrenheit: ');
   readln(celsius);
   fahrenheit := (celsius * 1.8) + 32;
   writeln('La temperatura es ', fahrenheit:0:2);
   readln;
end.
