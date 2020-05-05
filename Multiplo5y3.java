
//suma de los multiplos de 3 y 5 por debajo de mil
public class Multiplo5y3 {
	public static void main(String[] args) {
		int suma = 0;
		for(int i = 0; i < 1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
        			suma += i;
			} 
		}
		System.out.println("El resultado de la suma es: " + suma);
    	}
}