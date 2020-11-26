import java.util.Scanner;

public class Ejercicio6 {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    public static void menu(){
        int opcion=0;
        do {
            System.out.println("\nOpciones disponibles:");
            System.out.println("1.Convertidor de masa");
            System.out.println("2.Convertidor de Velocidad");
            System.out.println("3.Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    convertirMasa();
                    break;
                case 2:
                    convertidorVelocidad();
                    break;
                case 3:
                    System.out.println("\nGracias por usar este programa\n");
                    break;
                default:break;
            }

        }while (opcion != 3);
    }

    public static void  convertirMasa(){
        double libras,kilos;
        int seleccion=0;
        do {
            System.out.println("\n\tConversiones disponibles\n");
            System.out.println("1.Convertir de Libras a Kilogramos\n");
            System.out.println("2.Convertir de Kilogramos a Libras\n");
            System.out.print("Seleccione una opcion:\t ");
            seleccion = entrada.nextInt();

            if (seleccion < 1 || seleccion > 2) {
                System.out.println("\nOpcion Incorrecta, Intente de nuevo :)\n");
            }

        }while (seleccion < 1 || seleccion > 2);

        if (seleccion == 1){
            System.out.print("\nIngrese el peso en libras: ");
            libras = entrada.nextDouble();                           
            System.out.println("El peso de "+libras+" Lbs equivale a: "+kilogramos(libras) +" kg");


        }else{
            System.out.print("\nIngrese el peso en Kilogramos: ");
            kilos = entrada.nextDouble();
            System.out.println("El peso de "+kilos+" Kg equivale a: "+libras(kilos) + " lbs");
        }


    }

    public static void convertidorVelocidad(){
        double milles,kilometer;
        int seleccion;

        do{
        System.out.println("\n\tConversiones Disponibles\n");
        System.out.println("1.Convertir de Millas a Kilometros\n");
        System.out.println("2.Convertir de Kilometros a Millas\n");
        System.out.print("Seleccione una opcion:\n ");
        seleccion = entrada.nextInt();

        if (seleccion < 1 || seleccion > 2) {
            System.out.println("\nOpcion Incorrecta, Intente de nuevo :)\n");
        }

    }while (seleccion < 1 || seleccion > 2);



        if (seleccion == 1){
            System.out.print("\nIngrese la velocidad en millas: \n");
            milles = entrada.nextDouble();
            System.out.println("La velocidad de \t"+milles+" \tmillas equivale a:\t "+kilometros(milles)+"\t km\n");


        }else{
            System.out.print("\nIngrese la velocidad en Kilometros:\t ");
            kilometer= entrada.nextDouble();
            System.out.println("La velocidad de \t"+kilometer+"\t kilometros  equivale a: \t"+millas(kilometer)+" \tmillas\t");
        }




    }
    public static double kilogramos(double lb){
        double kilogramos = lb/2.205;
       return kilogramos;
    }

   
    public static double libras(double kg){
        double libras = kg * 2.205;

        return libras;
    }

    public static double kilometros(double millas){
        double km = millas * 1.609;

        return km;
    }

    public static double millas(double kilometros){
double millas = kilometros / 1.609;

return millas;
    }


}