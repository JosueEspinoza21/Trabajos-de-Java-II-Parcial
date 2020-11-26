import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int mult =0;
        int x=0;

        System.out.println("\t\tProgama que crea tablas de multiplicar\t\t");

        do {


            System.out.print("\nIngrese el numero de la tabla de multiplicar (0 al 12)\t: ");
            numero = entrada.nextInt();
            if (numero>0 && numero < 13 ) {
                System.out.println("\nTabla del " + numero + " es: \n");
                x++;
            }

            if (numero>0 && numero < 13 ) {
                for (int i=0;i <= 10;i++) {
                    mult = numero * i;
                    System.out.println(numero + " x " + i + " = " + mult);

                }

            }


        }while (numero>0 && numero < 13);

        System.out.println("Se imprimo "+ x +" tablas de multiplicar");

    }
}