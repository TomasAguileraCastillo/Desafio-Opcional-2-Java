public class CambiarWhile {
    public static void main(String[] args) {
        //Convertir el código anterior utilizando la sentencia do while, nombrando el programa
        //CambiarWhile.java.
        //La salida del código debe ser exactamente la misma
        //***************************************************************************
        //public class CambiarWhile {
        //   public static void main(String[] args) {
        //      int i = 0;
        //      while (i<50) {
        //          i+=1;
        //          System.out.printf("Iteración %d\n", i);
        //      }
        //   }
        //}
        //***************************************************************************

        int i=0;
        do {
            i++;
            System.out.printf("Iteración %d\n", i);
        }
        while (i<50);
    }
}
