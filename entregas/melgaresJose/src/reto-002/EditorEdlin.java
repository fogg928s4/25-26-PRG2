import java.util.Scanner;

class EditorEdlin {
    public static void main(String[] args) {
        int opcion = 0;
        imprimirMenuIncial();
        String[] buffer = new String[10];
        inicializarBuffer(buffer);
        int lineaActiva = 3;
        while (opcion != 4) {
            opcion = leerComando();
            ejecutarComando(opcion);
            imprimirEditor(buffer, lineaActiva);
            imprimirBarraEstado();
        }
       // limpiarPantalla();
    }

    private static void imprimirEditor(String[] buffer, int lineaActiva) {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(i);
            System.out.print(i == lineaActiva ? "*" : " ");
            System.out.print("| " + buffer[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }

    private static void inicializarBuffer(String[] buffer) {
        for(int i = 0; i < buffer.length; i++) {
            buffer[i] = "~";
        }
    }

    private static void imprimirMenuIncial() {
        String[] bufferMenu = {
            "Bienvenidos al editor EDLIN",
            "Utilice el menu inferior para editar el texto",
            "------",
            "[L] permite definir la linea activa",
            "[E] permite editar la linea activa",
            "[I] permite intercambiar dos lineas",
            "[B] borra el contenido de la linea activa",
            "[S] sale del programa",
            "",
            "No lea esto por favor"
        };
        imprimirEditor(bufferMenu,0);
    }

    private static void imprimirBarraEstado() {
        System.out.println("Comandos: [L]inea activa | [E]ditar | [I]ntercambiar | [B]orrar | [S]alir");
    }

    private static int leerComando() {
        Scanner scanner = new Scanner(System.in);
        String comando = scanner.nextLine();
        return mapearComando(comando);
    }

    private static int mapearComando(String comando) {
        String[] comandosValidos = { "L", "E", "I", "B", "S" };
        final int OPCION_INVALIDA = -1;

        for (int i = 0; i < comandosValidos.length; i++) {
            if (comando.equalsIgnoreCase(comandosValidos[i]))
                return i;
        }
        return OPCION_INVALIDA;
    }

    private static void ejecutarComando(int opcion) {
        switch (opcion) {
            case 0 -> cambiarLineaActiva();
            case 1 -> editarLineaActiva();
            case 2 -> intercambiarLineas();
            case 3 -> borrar();
        }
    }

    private static void cambiarLineaActiva() {
        System.out.println("cambiar linea activa...");
    }

    private static void editarLineaActiva() {
        System.out.println("Intercambiando lineas...");
    }

    private static void intercambiarLineas() {
        System.out.println("Intercambiando lineas...");
    }

    private static void borrar() {
        System.out.println("Borrando todo...");
    }

    private static void salir() {
        System.out.println("Bye Bye :D");
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
