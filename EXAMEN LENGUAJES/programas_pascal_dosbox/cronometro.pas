program Cronometro;
uses crt;
var
  horas, minutos, segundos : integer;
begin
  horas := 0;
  minutos := 0;
  segundos := 0;
  while true do
  begin
    clrscr;
    writeln(horas:2, ':', minutos:2, ':', segundos:2);
    delay(1000);
    segundos := segundos + 1;
    if segundos = 60 then
    begin
      segundos := 0;
      minutos := minutos + 1;
    end;
    if minutos = 60 then
    begin
      minutos := 0;
      horas := horas + 1;
    end;
  end;
end.
