package switch_case;

import java.util.Scanner;

public class limites {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int limmenor, limmayor;
        limmenor = 0;
        limmayor = 0;
        System.out.print("Por favor ingrese el limite inferior:");
        limmenor = teclado.nextInt();
        System.out.print("Por favor ingrese el limite superior:");
        limmayor = teclado.nextInt();

        // if(limmenor == limmayor) {
        //System.out.println("Los números introducidos no son válidos, deben ser distintos.");
//}
        //realiza el ciclo 
        System.out.println("Los limites son los siguientes ");

        //ciclo FOR loop  to print 1 to 10.
        for (int i = limmenor; i <= limmayor; i++) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("Limite inferior:  " + limmenor);
        System.out.println("Limite superior " + limmayor);

    }
}
