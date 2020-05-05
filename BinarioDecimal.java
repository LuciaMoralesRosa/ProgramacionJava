import java.util.Scanner;
public class BinarioDecimal {
	 public static void main(String[] ar){
	 
		 Scanner teclado = new Scanner(System.in);
		 int dividendo, resto, divisor = 2, numero;
		 String binario = "";
		 System.out.println("Ingrese el numero decimal a convertir: ");
		 numero = teclado.nextInt();
		 dividendo = numero;
	 	while(dividendo >= divisor){ 
	 		resto = dividendo % 2;
	 		if(resto == 1)
	 			binario = "1" + binario; 
	 		else
	 			binario = "0" + binario; 
	 			dividendo = dividendo/divisor; 
	 }
	 		if(dividendo == 1)
	 			binario = "1" + binario;
	 		else
	 			binario = "0" + binario;
	 		System.out.println("En sistema binario " + numero + " se escribe " + binario);
	 }
	}

