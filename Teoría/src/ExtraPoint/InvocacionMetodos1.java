package ExtraPoint;

public class InvocacionMetodos1 {
    public static void main(String[] args){
        Lenguaje dummy = new Java();
        dummy.imprimir((Java) dummy);
        ((Lenguaje) dummy).imprimir(dummy);
        ((Java) dummy).imprimir((Java)dummy);
        dummy.imprimir(dummy);
    }
}

/*
a)  No es pot executar. Compiler error.
b)  Compila, error en executar
c)  Lenguaje de programación genérico, System.out.println();
    Java, mostrar por pantalla
    Java, mostrar por pantalla
    Lenguaje de programación genérico, System.out.println();

d)  Java, mostrar por pantalla
    Java, mostrar por pantalla
    Lenguaje de programación genérico, System.out.println();
    Java, mostrar por pantalla

e)  Java, mostrar por pantalla
    Lenguaje de programación genérico, System.out.println();
    Java, mostrar por pantalla
    Lenguaje de programación genérico, System.out.println();

f)  Lenguaje de programación genérico, System.out.println();
    Java, mostrar por pantalla
    Lenguaje de programación genérico, System.out.println();
    Java, mostrar por pantalla
*/