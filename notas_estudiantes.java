package switch_case;

import java.text.DecimalFormat;
import java.util.Scanner;

public class notas_estudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, cont1 = 0, cont2 = 0, est = 0;

        System.out.print("cuantos estudiantes hay en la clase : ");
        est = sc.nextInt();

        for (int i = 0; i < est; i++) {
            System.out.print("Ingresa una nota: ");
            int n = sc.nextInt();
            sum = sum + n;

            if (n >= 3) {
                cont1++;
            } else {
                cont2++;
            }
        }
        if ((sum / est) >= 3) {
            System.out.println("Ganaron: "
                    + cont1 + " Perdieron " + cont2);

            DecimalFormat df = new DecimalFormat("#.00");

            System.out.print("El promedio es: " + df.format((double) sum / est) + "\n");

        } else {
            System.out.println("Ganaron: "
                    + cont1 + " Perdieron: " + cont2);
            DecimalFormat df = new DecimalFormat("#.00");

            System.out.print("El promedio es: " + df.format((double) sum / est) + "\n");

        }
    }
}
