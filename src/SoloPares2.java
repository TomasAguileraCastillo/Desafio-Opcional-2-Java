import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {

        //Parte 2: Ahora deberán crear el programa llamado SoloPares2.java, donde no se
        //considere el cero.
        //************************************************************************************

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero : ");
        int numero = leer.nextInt();
        int contador =1;
        int par =1;
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
