import java.util.Scanner;
public class permutacion{
	public static void algoritmo(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int v=i+1;
				int u=j+1;
				System.out.println(v+", "+u);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	//	String palabra = s.nextLine();
		int[] arr = {1,2,3,4};
		algoritmo(arr);
	}
}