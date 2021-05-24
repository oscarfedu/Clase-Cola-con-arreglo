import java.util.Scanner;
public class CajeroAutomatico{
	public static void Cajero(int pagar){
		int[] billetes={500,200,100,50,20,10,5,2,1};
		int[] cantidadBilletes = new int[billetes.length];

		for(int i=0; i<billetes.length;i++){
			cantidadBilletes[i] = (int)(pagar/billetes[i]);
			pagar=pagar-(cantidadBilletes[i]*billetes[i]);
			System.out.println(cantidadBilletes[i]+" de: "+billetes[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Cajero(x);	
	}
}