import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\t\tProgama que crea tablas de multiplicar\t\t");

       int empiezo;
        int end;
        int numero;
        int mult =0;

        System.out.print("\nIngrese el numero de la tabla de multiplicar\t: ");
        numero = entrada.nextInt();

        System.out.print("\nIngrese el inicio de la tabla del \t"+numero+"\t: ");
        empiezo = entrada.nextInt();


        System.out.print("\nIngrese el final de la tabla del \t"+numero+ " \t:");
        end = entrada.nextInt();

        if (empiezo <= end){
            System.out.println("\tSu tabla del \t" + numero+ "\t es\t: \n");
            for (int i = empiezo; i <= end ;i++ ){
                mult = numero*i;
                System.out.println(numero + " x " + i +" = "+mult);
            }
        }

        else {
            System.out.println("\tNo se puede mostrar la tabla en ese orden\t");
        }



    }
}
