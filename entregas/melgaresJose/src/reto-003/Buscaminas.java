
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {

        int minas = 0;
        int celdasVacias = 0;
        int posa = 0;
        int posb = 0;
        int posc = 0;
        int posd = 0;
        int posx = 0;
        int posy = 0;
        boolean salida = false;

        String tablero[][] = {
            {"**", " 1", " 2", " 3", " 4", " 5", " 6", " 7"},
            {" 1", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 2", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 3", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 4", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 5", "  ", "  ", "  ", "  ", "  ", "  ", "  "}
        };
        String tablero2[][] = {
            {"**", " 1", " 2", " 3", " 4", " 5", " 6", " 7"},
            {" 1", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 2", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 3", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 4", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
            {" 5", "  ", "  ", "  ", "  ", "  ", "  ", "  "}
        };

        colocarMinas(tablero);

        while (!salida) {

            for (int x = 0; x < tablero2.length; x++) {
                System.out.print("|");
                for (int y = 0; y < 8; y++) {

                    System.out.print(tablero2[x][y]);
                }
                System.out.println("|");
            }

            System.out.println("introduzca posicion X");
            Scanner sc = new Scanner(System.in);
            posx = sc.nextInt();

            System.out.println("Introduzca posicion Y");
            Scanner sc2 = new Scanner(System.in);
            posy = sc.nextInt();

            if ((tablero[posx][posy]) == "  ") {
                tablero2[posx][posy] = "--";
                celdasVacias++;
            } else {
                tablero2[posx][posy] = "**";
                minas++;
            }

            for (int x = 0; x < tablero2.length; x++) {
                System.out.print("|");
                for (int y = 0; y < 8; y++) {

                    System.out.print(tablero2[x][y]);
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

    private static void colocarMinas(String[][] tablero) {
        final int CANTIDAD_MINAS = 5;
        int posicionXMina;
        int posicionYMina;
        for(int i = 1 ; i <= CANTIDAD_MINAS; i++){
            posicionXMina = obtenerNumeroAleatorio(tablero[0].length);
            posicionYMina = obtenerNumeroAleatorio(tablero.length);
            tablero[posicionYMina][posicionXMina] = "MM";
        }
    }

    private static int obtenerNumeroAleatorio(int maximo) {
        return (int) ((Math.random() * maximo) + 1);
    }
}
