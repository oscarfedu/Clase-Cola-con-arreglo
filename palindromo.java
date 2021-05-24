import java.util.Scanner;
public class palindromo{
	public static boolean algoritmo(String frase){

		char vacio = ' ';
		frase = frase.toLowerCase();
		int tam = frase.length();
		int a=0;
		int b= tam-1;

		for(; a<frase.length() && b >= 0;a++, b--){
			if(frase.charAt(a) == vacio){
				a++;
			}
			if(frase.charAt(b) == vacio){
				b--;
			}
			if(frase.charAt(a) != frase.charAt(b)){
					return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String palabra = s.nextLine();
		System.out.println(algoritmo(palabra));
	}
}