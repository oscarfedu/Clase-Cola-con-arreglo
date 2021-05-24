import java.util.Scanner;
public class entero{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos = sc.nextInt();
		//caso n
		for(int n=0;n<casos;n++){
			int tamArreglo = sc.nextInt();

			String arr = sc.nextLine();
			String [] vect = arr.split(" ");
			int[] arreglo=new int[tamArreglo];

			for(int a=0;a<tamArreglo;a++){
				arreglo[a]=(int)vect[a].charAt(0);

			}
			//sc.nextLine();
			System.out.println("Caso # "+n+": "+ReverSort(arreglo));

		}

	}

	public static int ReverSort(int[] arreglo){
		int res = 0;
		for(int i=0;i<arreglo.length-1;i++){
			int j=arreglo[i];
			//Encuentra j
			for(int k=i+1;k<arreglo.length;k++){
				if(arreglo[k]<arreglo[j])
					j=k;
			}
			//resultado
			res = res+(j-i)+1;
			//inversa
			int[] arreglo2=new int[arreglo.length];
			arreglo2=arreglo;
			for(int x=i, y=j;x<=j;x++, y--){
				arreglo2[x]=arreglo[y];
			}
			arreglo=arreglo2;
		}
		return res;
	}

}