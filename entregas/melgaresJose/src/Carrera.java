class Carrera {
    final int NUMERO_PARTICIPANTES = 3;

    Pista pistaJuego;
    Caballo[] competidores;
    boolean hayGanador;    
    int turno;

    public Carrera() {
        competidores = new Caballo[NUMERO_PARTICIPANTES];
        for(int i = 0; i < NUMERO_PARTICIPANTES ; i++) {
            competidores[i] = new Caballo();
        }
        pistaJuego = new Pista(40);
        turno = 0;
    }

    public void jugar() {
        do {
            mostrarTurno();
            pistaJuego.dibujar();
            competidores[turno].mostarAvance();
            avanzarTurno();
        } while(turno !=0);
        
        
    }

    private void mostrarTurno() {
        System.out.println("Turno " + turno + "!!!");
    }
    private void avanzarTurno() {
        turno++;
        if(turno == NUMERO_PARTICIPANTES) {
            turno = 0;
        }
    }


}