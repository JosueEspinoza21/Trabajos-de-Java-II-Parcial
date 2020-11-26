import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\tProgama que crea tablas de multiplicar\t\t");

        int empiezo;
        int end;
        int Num;
        int mult =0,x=0;

        System.out.print("\nIngrese el numero de la tabla de multiplicar\t: ");
        Num = entrada.nextInt();

        System.out.print("\nIngrese el inicio de la tabla del "+Num+"\t : ");
        empiezo = entrada.nextInt();


        System.out.print("\nIngrese el final de la tabla del "+Num+ " \t:");
        end = entrada.nextInt();

        x = empiezo;

        if (empiezo <= end){
            System.out.println("\nSu tabla del " + Num+ " es: \n");
            while (x <= end){
                mult = Num*x;
                System.out.println(Num + " x " + x +" = "+mult);
                x++;
            }
        }

        else {
            System.out.println("\t\tNo se  puede mostrar la tabla en ese orden\t\t");
        }
    }
}