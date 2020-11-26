
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\nPrograma para calcular las letras en una cadena\n");

        
        pedirDatos(entrada);

    }

    public static void pedirDatos(Scanner entrada){
        String cadena;
        String palabras[];
        System.out.println("Ingrese una lista de palabras separadas por comas:\t ");
        cadena = entrada.nextLine();
        palabras = cadena.split(",");



        sacarletra(palabras,entrada);

    }

    public static void sacarletra(String[] palabra,Scanner entrada){
        char letra;
        int contadores[] = new int[palabra.length];
        int contador=0,x=0;

        System.out.print("\nIngrese la letra que quiere buscar en las palabras:\t ");
        letra = entrada.nextLine().charAt(0);

        for(int i=0;i<palabra.length;i++){
            contador=0;
            for(int j=0;j< palabra[i].length();j++){

                if(letra == palabra[i].charAt(j)){
                  contador++;

                }
              contadores[i]= contador;

            }

        }

        System.out.println("\nLa cantidad de letras \t "+letra+" \t  es:\t ");
        for (int i=0;i<palabra.length;i++){
            System.out.println(palabra[i] + " \t=\t "+contadores[i] +"\t letras\t " + letra);
        }

    }

}