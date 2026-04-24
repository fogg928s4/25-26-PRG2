class Carrera {
    final int NUMERO_PARTICIPANTES = 3;

    Pista pistaJuego;
    Caballo[] competidores;
    boolean hayGanador;    
    int turno;

    public Carrera() {
        pistaJuego = new Pista(40);
        for(int i = 0; i < NUMERO_PARTICIPANTES ; i++) {
            competidores[i] = new Caballo();
        }
        turno = 1;
    }

    public void jugar() {
        mostrarTurno();
        pistaJuego.dibujar();       
        competidores[0].mostarAvance();
    }

    private void mostrarTurno() {
        System.out.println("Turno " + turno + "!!!");
    }
}