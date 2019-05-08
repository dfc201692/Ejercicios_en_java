package switch_case;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ventas {

    public static void main(String[] args) {
        Scanner obtener = new Scanner(System.in);

        int estudiantes = 20;
        double venta, i, Mayorventa, Menorventa, sumaVentas;
        System.out.println("Ingrese las 20 ventas realizadas: ");
        Mayorventa = 0;
        Menorventa = 100;
        sumaVentas = 0;

        for (i = 1; i <= estudiantes; i++) {
            System.out.print("Ingrese la venta: " + i + " : ");
            venta = obtener.nextDouble();
            sumaVentas = sumaVentas + venta;

            if (venta > Mayorventa) {
                Mayorventa = venta;
            }

            if (venta < Menorventa) {
                Menorventa = venta;
            }
        }

        System.out.print("La mayor venta es: " + Mayorventa + "\n");
        System.out.print("La menor venta es: " + Menorventa + "\n");
        System.out.println("La suma de las ventas es: " + sumaVentas);

    }
}
