package publica;

public class Fraccion {
    public Fraccion(double numerador, double denominador);
    public Fraccion(double numeroEntero);

    public Fraccion(Fraccion fraccion);

    public Fraccion clonar();

    public Fraccion dividir(Fraccion divisor);
    public Fraccion multiplicar();
    public Fraccion sumar(Fraccion sumando);
    double calcularMCD(double  a, double b);

    public void invertir();
    public void oponer();
}
