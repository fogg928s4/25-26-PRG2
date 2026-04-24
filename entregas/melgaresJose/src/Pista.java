class Pista {
    private final int LONGITUD_PISTA = 40;
    private int longitud;

    public Pista(int longitud) {
        this.longitud = longitud;
    }

    public void dibujar() {
        for(int i = 0; i < longitud; i++) {
            System.out.print("-");
        }
    }
}
