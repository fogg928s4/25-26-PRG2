class Fraccion {
    private double numerador;
    private double denominador;

    public Fraccion(double numerador, double denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public Fraccion(double numeroEntero) {
        numerador = numeroEntero;
        denominador = 1;
    }
}