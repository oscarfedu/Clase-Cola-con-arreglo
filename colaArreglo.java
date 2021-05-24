public class colaArreglo{
	final int TAM = 15;
	int[] arreglo;
	int i;
	int j;
	int size;
	public colaArreglo(){
		arrelo = new int[TAM];
		i=0;
		j=0;
		size=0;
	}

	public void sacar(){


	}
	public void meter(int x){
		if(isFull()){
			duplicarArreglo();
		}
		arreglo[j]=x;
		size++;
		j=(j+1)%TAM;
	}

	public boolean isEmpty(){

	}

	public void mostrarCola(){

	}

	public void duplicarArreglo(){

	}

	public boolean isFull(){
		return size==TAM;
	}



}
public static void main(String []args){
	colaArreglo objeto=new colaArreglo();

}    

[1                  ] tam 10   j=(j+1)%TAM; size=1
 0,1,2,3,4,5,6,7,8,9

 i=0 //el indice del elemento que vamos a sacar
 j=1 //el indice del elemnto que vamos a meter

 public void meter(int x){
		arreglo[j]=x;
 }

public void enqueue(int x){
      if(!isEmpty()){
        System.out.println("Cola llena");
      }
      else{
          int i=(f+sz)%(arr.length);
          arr[i]=x;
            sz++;
      }
   }

public boolean isEmpty(){
      if(sz==0){
         return true;
      }

