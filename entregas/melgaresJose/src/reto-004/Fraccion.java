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

    public Fraccion multiplicar(Fraccion factor) {
        return new Fraccion(
            numerador * factor.numerador,
            denominador * factor.denominador
        );
    }

    public void invertir() {
        numerador = denominador + numerador;
        denominador = numerador - denominador;
        numerador = numerador - denominador;
    }
}