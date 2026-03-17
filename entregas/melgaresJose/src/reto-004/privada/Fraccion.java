class Fraccion {
    private double numerador;
    private double denominador;

    public Fraccion(double numerador, double denominador) {
        assert denominador != 0 : "El denominador no puede ser 0!";
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public Fraccion(double numeroEntero) {
        this(numeroEntero, 1);
    }

    public Fraccion clonar() {
        return new Fraccion(numerador,denominador);
    }

    public Fraccion multiplicar(Fraccion factor) {
        return new Fraccion(
            numerador * factor.numerador,
            denominador * factor.denominador
        );
    }
    public Fraccion dividir(Fraccion divisor) {
        return new Fraccion(
            numerador * divisor.denominador,
            denominador * divisor.numerador
        );
    }
    public Fraccion sumar(Fraccion sumando) {
        double denominadorAux = calcularMCD(denominador, sumando.denominador);
        double numeradorAux = denominadorAux * (numerador + sumando.numerador);
        return new Fraccion(numeradorAux,denominadorAux); 
    }

    double calcularMCD(double  a, double b) {
        while (b != 0) {
            double temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
    public void invertir() {
        numerador = denominador + numerador;
        denominador = numerador - denominador;
        numerador = numerador - denominador;
    }


}