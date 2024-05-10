import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {

        //2. Ejercicio - Solo pares
        //En este problema deberán mostrar elementos dependiendo de una condición.
        //Parte 1: Deberán crear un programa llamado SoloPares.java, el cual deberá recibir
        //un parámetro n ingresado por el usuario y mostrar los primeros n pares.
        //Si n = 4, la salida del programa deberá ser:
        //0
        //2
        //4
        //6
        //*********************************************************************

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero : ");
        int numero = leer.nextInt();
        int contador =1;
        int par =0;
        while (contador <= numero)
        {
            if (par % 2 == 0) {
                System.out.println(par);
                contador++;
            }
            par++;
        }


    }
}
