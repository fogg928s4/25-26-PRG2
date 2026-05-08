class Blackjack {   
    private Console console;
    private int puntaje;
    private Baraja baraja;
    private Mano mano;

    public Blackjack() {
        console = new Console();
        puntaje = 0;
        baraja = new Baraja();
        mano = new Mano();
    }

    private int obtenerPuntaje() {
        return 0;
    }
    private void jugar() {
        Menu menu = new Menu();

        boolean estaJugando = true;
        boolean haPerdido = false;

        do {
            this.mostrarTapete();
            menu.mostrar();
            switch (menu.pedirOpcion()) {
                case 1 -> console.writeln("opcion 1");
                case 2 -> console.writeln("opcion2");
                case 3 -> estaJugando = false;
            }
            haPerdido = this.seHaPasado();
        } while (estaJugando && !haPerdido);
        console.writeln((!haPerdido ? "NO " : "") + "GANASTE");
    }

    private boolean seHaPasado() {
        return puntaje > 21;
    }

    
    private void mostrarTapete() {
        console.cleanScreen();
        baraja.mostrar();
        this.linea();

        this.linea();
        
        this.linea();
    }

    private void linea() {
        console.writeln("-".repeat(30));
    }


    public static void main(String[] args) {
        new Blackjack().jugar();
    }
}
