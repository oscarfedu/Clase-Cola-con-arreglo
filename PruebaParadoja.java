/*
 * Autor: H. Tejeda
 * Fecha: 18 feb 2019
 *
 * La paradoja del cumpleaños dice que de un conjunto de 23 personas, hay una
 * probabilidad de 50.7% de que al menos dos personas de ellas cumplan años
 * el mismo día. Diseñar la aplicación PruebaParadoja para validar esta
 * paradoja, mediante una serie de experimentos, considerar los siguientes
 * tamaños n para el conjunto de personas n = 5, 10, 15, 20, ..., 100. Para
 * incrementar la precisión para cada tamaño de n hacer varias repeticiones.
 */

import java.util.Scanner;
public class PruebaParadoja {

	public static void main(String[] args) {
		int n = entrada(); // pedir cantidad de simulaciones
		simular(n); // realizar simulación
	}

   // el método pide un entero que sea mayor a uno y 
   // es robusto a entradas que no son enteros.
	public static int entrada() {
      int n = 0;
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca la cantidad de repeticiones: ");
      boolean hayEnt = false;
      while(!(hayEnt=sc.hasNextInt()) || (n=sc.nextInt())<2 ) {
         if( !hayEnt ) {
            System.out.println("\tNo se introdujo un entero");
            sc.next();
         }
         else if(n<2)
            System.out.println("\tSe debe hacer al menos una repetición");
         System.out.print("Intente nuevamente ... ");
      }
		return n;
	}

	public static void simular(int n) {
		System.out.println("Se hacen "+n+" simulaciones para cada conjunto");
		System.out.println("Personas Probabilidad");
		int[] conjunto = {5,10,15,20,23,25,35,45,60,80,100};

		for(int personas: conjunto) { // iterar con cada tamaño de conjunto 
			int encontrados = 0;
			for(int i=0; i<n; ++i) {  // hacer n simulaciones
				boolean[] cumples = new boolean[365]; // guarda cumples
				boolean dosMismaFecha = false;
				// generar cumple para cada persona
				for(int j=0; j<personas; ++j) { //
					int fecha = (int) (Math.random()*365);
					if(cumples[fecha]) { // ¿alguien cumplió el mismo día?
						j = personas;     // salir
						dosMismaFecha = true;
					}
					else
						cumples[fecha] = true;
				}
				if(dosMismaFecha) ++encontrados;
			}
         // después de n simulaciones se calcula la probabilidad
			System.out.printf("  %3d      %6.2f%%\n",
					personas,encontrados/(float) n*100f);
		}
	}
}
