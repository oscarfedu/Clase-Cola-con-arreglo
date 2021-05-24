import java.util.*;
public class paradoja{
	public static void main(String[] args) {
		algoritmo();
		
	}

	public static void algoritmo(){
		final int precision=100000;
		for (int o=5;o<=55 ;o=o+5) {
			int seCumple=0;
			int n=23;
			for (int m=0;m<precision; m++) {
    			int[] cumpleaños = new int[n];
				for(int i = 0; i < n; i++){
					cumpleaños[i]= (int)(Math.random()*365+1);
				}


				boolean hayRepetidos = repetidos(cumpleaños);
				if(hayRepetidos){
					seCumple++;
				}

			}
			double cumple=(double)seCumple;
			double pres= (double)precision;
			double resultado=((cumple*100)/(pres));
			System.out.println("Para n = "+n+" es la precisiòn de: "+resultado+"%"); 
		}
	}

	public static boolean repetidos(int[] arr){
		int rep=0;
		for(int i = 0; i < arr.length-1; i++){
			for (int j = i+1;j < arr.length ; j++) {
				if(arr[i] == arr[j]){
					rep++;
				}	
			}
		}
		return rep > 0;
	}

}