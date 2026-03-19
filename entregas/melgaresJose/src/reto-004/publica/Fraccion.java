package publica;

public class Fraccion {
    public Fraccion(double numerador, double denominador);
    public Fraccion(double racional);

    public Fraccion(Fraccion fraccion);

    public Fraccion clonar();

    public Fraccion dividir(Fraccion fraccion);
    public Fraccion multiplicar(Fraccion fraccion);
    public Fraccion sumar(Fraccion fraccion);
    double calcularMCD(double  a, double b);

    public void invertir();
    public void oponer();
}
