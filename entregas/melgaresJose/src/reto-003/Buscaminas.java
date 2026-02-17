
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        final int NUMERO_FILAS = 5;
        final int NUMERO_COLUMNAS = 7;
        int minas = 0;
        int celdasVacias = 0;
        int posx = 0;
        int posy = 0;
        boolean salida = false;
        Scanner scanner = new Scanner(System.in);
        int[][] campoMinado = new int[NUMERO_FILAS][NUMERO_COLUMNAS];
        String[][] tableroJuego = new String[NUMERO_FILAS][NUMERO_COLUMNAS];

        inicializarCampo(campoMinado);
        colocarMinas(campoMinado);
        inicializarTablero(tableroJuego);


        while (!salida) {
            
            imprimirTablero(tableroJuego);
            for (int x = 0; x < tableroJuego.length; x++) {
                System.out.print("|");
                for (int y = 0; y < 8; y++) {

                    System.out.print(tableroJuego[x][y]);
                }
                System.out.println("|");
            }

            System.out.println("introduzca posicion X");
            
            posx = scanner.nextInt();

            System.out.println("Introduzca posicion Y");
            posy = scanner.nextInt();

            if ((campoMinado[posx][posy]) == 0) {
                tableroJuego[posx][posy] = "--";
                celdasVacias++;
            } else {
                tableroJuego[posx][posy] = "**";
                minas++;
            }

            for (int x = 0; x < tableroJuego.length; x++) {
                System.out.print("|");
                for (int y = 0; y < 8; y++) {

                    System.out.print(tableroJuego[x][y]);
                }
                System.out.println("|");
            }

            if (minas == 3) {
                System.out.println("Lo siento, ha perdido");
                salida = true;
            }

            if (celdasVacias == 30) {
                System.out.println("Enhorabuena, ha ganado");
                salida = true;
            }

        }

    }

    private static void colocarMinas(int[][] tablero) {
        final int CANTIDAD_MINAS = 5;
        final int MINA = 1;
        
        int posicionXMina;
        int posicionYMina;
        for (int i = 1; i <= CANTIDAD_MINAS; i++) {
            posicionXMina = obtenerNumeroAleatorio(tablero[0].length);
            posicionYMina = obtenerNumeroAleatorio(tablero.length);
            tablero[posicionYMina][posicionXMina] = MINA;
        }
    }

    private static int obtenerNumeroAleatorio(int maximo) {
        return (int) ((Math.random() * maximo) + 1);
    }

    private static void inicializarTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++) {
            for(int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }
    }
    private static void inicializarCampo(int[][] campo) {
        for(int i = 0; i < campo.length; i++) {
            for(int j = 0; j < campo[i].length; j++) {
                campo[i][j] = 0;
            }
        }
    }

    private static void imprimirTablero(String[][] tablero) {
        imprimirCabecera(tablero[0].length);
        for(int i = 0; i < tablero.length; i++) {
            for(int j = 0; j < tablero[i].length; j++) {
                System.out.print((i+1) + "|" + tablero[i][j]);
            }
            System.out.println();
        }
    }

    private static void imprimirCabecera(int columnas) {
        System.out.print("  ");
        for(int i = 1; i <= columnas; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
