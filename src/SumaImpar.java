import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        //Parte 1: Crea programa SumaImpar.java donde se sumen todos los valores
        //impares, desde 0 hasta n, donde n es ingresado por el usuario.
        //Si n = 6, la salida del programa deberá ser:
        //9
        //Que corresponde a sumar 1+3+5.
        //**********************************************************************

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero : ");
        int numero = leer.nextInt();
        int sumar =0;
        int inicia = 0;

        while (inicia <= numero)
        {
            if (inicia % 2 == 1) {
                sumar=sumar+inicia;
            }
            inicia++;
        }
        System.out.println(sumar);

    }
}
