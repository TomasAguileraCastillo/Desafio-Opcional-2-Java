import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese Numeros a Mostrar: ");
        int numero = leer.nextInt();
        int anterior1 = 0;
        int anterior2 = 1;
        int sumador = 0;
        int i=0;

        do {
            System.out.println(anterior1);
            sumador = anterior1 + anterior2;
            anterior1 = anterior2;
            anterior2 = sumador;
            i++;
        }while (i< numero);
    }
}
