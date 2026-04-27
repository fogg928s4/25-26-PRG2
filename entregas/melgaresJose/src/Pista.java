class Pista {
    private int longitud;
    private Caballo[] competidores;
    private int[] posiciones;

    public Pista(int longitud, Caballo[] competidores) {
        this.longitud = longitud;
        this.competidores = competidores;
        colocarEnSusMarcas();
    }
    private void colocarEnSusMarcas() {
        posiciones = new int[competidores.length];
        for(int i = 0; i < competidores.length; i++) {
            posiciones[i] = 0;
        }
    }
    public void dibujar() {
        for(int i = 0; i < longitud; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public boolean hayGanador() {
        return competidores[0].posicion >= longitud;
    }
}
