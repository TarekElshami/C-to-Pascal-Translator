program main;
const
	stringConst = 'string without quote marks, unless they have a backslash like: \' This is still part of the const'
	decimalIntConst = +9
	octalIntConst = 0-3
	hexIntConst = 0x+A9F
	decimalFloatConst = +9.32
	octalFloatConst = 0-3.06
	hexFloatConst = 0x+A9F.7D
var
	i, j: INTEGER;
	pepe, juan, miguel: REAL;
procedure voidReturnFunction(voidParam, voidParam2: void; intParam: INTEGER; floatParam: REAL);
	var
		voidVar1, voidVar2, voidVar3, voidVar4: void;
		intVar1, intVar2: INTEGER;
		unreachableVar: REAL;
	begin
		someVar := ( ( puedesAnidarTantosComoQuieras ) );
		someOtherVar := 32;
		yetAnotherVar := someFunct(3, someVar, anotherFunction);
		lastVar := 32 + times(2, 3);
		someFunction;
		voidReturnFunction := value(var1, var2, 2) div 3;
		unreachableCall;
		unreachableAssignment := 0x9.58;
	end;
function functionName() : INTEGER;
	begin
		if 0+7 < var1 or not var2 = f and 0x9A > ( -10 * 0+5 ) then
		begin
			noPermiteBloquesVacios;
		end
		else
		begin
			noPermiteBloquesVacios;
		end
		while ( 2 + 2 ) = $_5 do
		begin
			noPermiteBloquesVacios;
		end
		repeat
		var
			i, j: INTEGER;
		begin
			i := 0;
			j := i;
		end
		until f > +3;
		var0 := -07;
		while var0 > f(0xFF) do
		begin
			noPermiteBloquesVacios;
			var0 := var0 + 1;
		end
	end;
begin
	i := 0;
	funcion;
	funcion2;
end.
