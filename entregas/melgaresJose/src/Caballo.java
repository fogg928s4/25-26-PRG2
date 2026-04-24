class Caballo {
    
    private final int AVANCE_MAXIMO = 3;
    private int posicion;

    public Caballo() {
        posicion = 0;
    }
    public void mostarAvance() {
        moverse();
        String vacio = " ";
        String caballoASCII = ";-;`";
        System.out.println(vacio.repeat(posicion) + caballoASCII);
    }
    private void moverse() {
        int avance = determinarAvance();
        posicion += avance;
    }

    private int determinarAvance() {
        return (int) (Math.random() * AVANCE_MAXIMO);
    }

}
