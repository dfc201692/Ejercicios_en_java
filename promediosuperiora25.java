package switch_case;

import java.util.Scanner;

public class promediosuperiora25 {

    public static class Ejer2 {

        public static void main(String[] args) {
            int Edad, Suma = 0, Contador = 0, Promedio = 0;
            Scanner Teclado = new Scanner(System.in);
            do {
                System.out.println("Ingrese la edad de la persona");
                Edad = Teclado.nextInt();
                Suma = Suma + Edad;
                Contador = Contador + 1;
                Promedio = Suma / Contador;
                System.out.println("El promedio por ahora es " + Promedio);
                if (Promedio > 25) {
                    break;

                }

            } while (Edad > 0);
            System.out.println("LA suma de las edades es :" + Suma + " La Cantidad  de edades ingresadas fueron: " + Contador);
            System.out.println("El promedio es igual a: " + Promedio);
            if (Promedio > 25) {
                System.out.println("El promedio fue mayor que 25 y ha finalizado");
            } else {
                System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
            }

        }

    }
}
