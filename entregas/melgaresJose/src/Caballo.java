class Caballo {
    
    private final int AVANCE_MAXIMO = 3;

    public Caballo() {}

    public void moverse() {
        int avance = determinarAvance();
    }

    private int determinarAvance() {
        return (int) (Math.random() * AVANCE_MAXIMO);
    }

}
