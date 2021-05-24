import java.util.Scanner;
public class torresHanoi{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        	int n;
        	System.out.println("Numero de discos: ");
        	n = sc.nextInt();
        	Hanoi(n,"inicio","auxiliar","destino");  //1:origen  2:auxiliar 3:destino
	}

	public static void Hanoi(int n,String ini, String aux, String dest){
		if(n == 1){
			System.out.println("Mover de "+ini+" a "+dest);
		}
		else{
			Hanoi(n-1, ini, dest, aux);
			System.out.println("Mover de "+ini+" a "+dest);
			Hanoi(n-1, aux, ini, dest);

		}
	}



}
