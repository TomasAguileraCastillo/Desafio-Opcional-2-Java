
# Desafío 2 Opcional Java

---
1.Ejercicio - While por do while
---
---
   A continuación se presenta el siguiente código:


    public class CambiarWhile {
       public static void main(String[] args) {
            int i = 0;
            while (i<50) {
                    i+=1;
                    System.out.printf("Iteración %d\n", i);
            }
       }
    }

-Convertir el código anterior utilizando la sentencia do while, nombrando el programa
CambiarWhile.java.

- La salida del código debe ser exactamente la misma

---
2.Ejercicio - Solo pares
---
---


-En este problema deberán mostrar elementos dependiendo de una condición.

* Parte 1: Deberán crear un programa llamado SoloPares.java, el cual deberá recibir
   un parámetro n ingresado por el usuario y mostrar los primeros n pares.

    Si n = 4, la salida del programa deberá ser:

      0
      2 
      4
      6

* Parte 2: Ahora deberán crear el programa llamado SoloPares2.java, donde no se
         considere el cero.
       
  Si n = 4, la salida del programa deberá ser:

      2 
      4
      6
      8
   

---
3.Ejercicio - Suma impares
---
---

-   En este problema realizaremos sumatorias, con la condición que el número a sumar será
   impar.

 -Parte 1: Crea programa SumaImpar.java donde se sumen todos los valores
   impares, desde 0 hasta n, donde n es ingresado por el usuario.

   Si n = 6, la salida del programa deberá ser:

    9

   Que corresponde a sumar 1+3+5.

-Parte 2: Crear programa SumaImparLimite.java, donde el usuario ingresa dos
   valores, el límite inferior (min) y superior(max) del intervalo, para realizar la suma de
   los impares.

   Si min = 6 y max = 30 , la salida del programa deberá ser:

    216

   Que corresponde a sumar 7+9+11+13+15+17+19+21+23+25+27+29.

 

---
4.Ejercicio - Secuencia de Fibonacci
---
---
   La secuencia de Fibonacci se caracteriza donde el siguiente número de la secuencia es la
   suma de los dos anteriores.
   
    0, 1, 1, 2 , 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
   
Donde:

    - F(0) = 0
    - F(1) = 1
    - F(2) = 1
    - F(3) = 2
    - F(4) = 3
    - F(n) = F(n-1) + F (n-2)

   Requerimiento

- Se debe crear un programa que reciba un número ingresado por el usuario, que indique
   cuántos elementos de la serie de Fibonacci se deben mostrar, y el programa debe mostrar los
   primeros n números de la secuencia de Fibonacci.
  
    Si se ingresa n = 7, se debe mostrar el siguiente resultado:


    0
    1
    1
    2
    3
    5
    8
    13

---

