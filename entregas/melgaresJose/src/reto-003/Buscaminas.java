
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
        //He tenido problemas al hacerlo con un bucle y al no encontrar la solucion he preferido hacerlo asi aun sabiendo que es mas costoso
        posa = (int) ((Math.random() * 5) + 1);
        posb = (int) ((Math.random() * 7) + 1);
        for (int x = 1; x < tablero.length; x++) {
            for (int y = 1; y < 8; y++) {

                tablero[posa][posb] = "MM";
            }
        }

        posa = (int) ((Math.random() * 5) + 1);
        posb = (int) ((Math.random() * 7) + 1);
        for (int x = 1; x < tablero.length; x++) {
            for (int y = 1; y < 8; y++) {

                tablero[posa][posb] = "MM";
            }
        }

        posa = (int) ((Math.random() * 5) + 1);
        posb = (int) ((Math.random() * 7) + 1);
        for (int x = 1; x < tablero.length; x++) {
            for (int y = 1; y < 8; y++) {

                tablero[posa][posb] = "MM";
            }
        }

        posa = (int) ((Math.random() * 5) + 1);
        posb = (int) ((Math.random() * 7) + 1);
        for (int x = 1; x < tablero.length; x++) {
            for (int y = 1; y < 8; y++) {

                tablero[posa][posb] = "MM";
            }
        }
        posa = (int) ((Math.random() * 5) + 1);
        posb = (int) ((Math.random() * 7) + 1);
        for (int x = 1; x < tablero.length; x++) {
            for (int y = 1; y < 8; y++) {

                tablero[posa][posb] = "MM";
            }
        }

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
}
