#define stringConst 'string without quote marks, unless they have a backslash like: \' This is still part of the const'

#define decimalIntConst +9
#define octalIntConst 0-3
#define hexIntConst 0x+A9F

#define decimalFloatConst +9.32
#define octalFloatConst 0-3.06
#define hexFloatConst 0x+A9F.7D

void voidReturnFunction(void voidParam, void voidParam2, int intParam, float floatParam) {
//los intros y tabulaciones no los pone explícitos, pero asumo que los permite
    void voidVar1, voidVar2;

    someVar=((puedesAnidarTantosComoQuieras));
    someOtherVar=32;
    yetAnotherVar=someFunct(3, someVar, anotherFunction());
    lastVar= 32 + times(2,3);

    void voidVar3, voidVar4;
    int intVar1, intVar2;

    someFunction();

    return value(var1,var2,2) / 3;

    unreachableCall();
    float unreachableVar;
    unreachableAssignment = 0x9.58;
}

//program could end here, but let's continue
int functionName(void){
    if (0+7 < var1 || !var2==f() && 0x9A>(-10 * 0+5)){
        //declaraciones, asignaciones, llamadas, if, while, do, for
        noPermiteBloquesVacios();
    } else {
        //else if does not seem to be supported directly
        //declaraciones, asignaciones, llamadas, if, while, do, for
        noPermiteBloquesVacios();
    }

    while ((2 + 2)==$_5) { //$_5 is a variable, weird name, huh?
        noPermiteBloquesVacios();
    }

    do {
        int i;
        int j;
        i = 0;
        j = i;
    } until (f()>+3)

    for (var0 = -07; var0>f(0xFF); var0 = var0 + 1) {
        noPermiteBloquesVacios();
    }
}

int main(void){
    int i;
    int j;
    float pepe;
    float juan, miguel;
    i = 0;
    funcion();
    funcion2(a, b, 12);
}
