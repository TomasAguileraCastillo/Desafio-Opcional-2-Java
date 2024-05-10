import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        //Parte 2: Crear programa SumaImparLimite.java, donde el usuario ingresa dos
        //valores, el límite inferior (min) y superior(max) del intervalo, para realizar la suma de
        //los impares.
        //Si min = 6 y max = 30 , la salida del programa deberá ser:
        //216
        //Que corresponde a sumar 7+9+11+13+15+17+19+21+23+25+27+29.
        //*************************************************************************************************

        Scanner leer = new Scanner(System.in);
        System.out.print("limite inferior(min) : ");
        int numero1 = leer.nextInt();
        System.out.print("limite superior(max) : ");
        int numero2 = leer.nextInt();
        int sumar =0;
        int inicia = numero1;
        int termina = numero2;
        while (inicia <= termina)
        {
            if (inicia % 2 == 1) {

                sumar=sumar+inicia;
            }
            inicia++;
        }
        System.out.println(sumar);
    }
}
